package com.enel.momoffermanipulation.application.port.inbound.scenario.usecase.updatedataoffer;

import com.enel.momoffermanipulation.application.port.inbound.command.RegistrationOfferCommand;
import com.enel.momoffermanipulation.application.port.inbound.scenario.ContextUseCase;
import com.enel.momoffermanipulation.application.port.inbound.scenario.ScenarioSteps;
import com.enel.momoffermanipulation.application.port.inbound.scenario.context.UpdateOfferDataContext;
import com.enel.momoffermanipulation.application.port.outbound.OfferPersistencePort;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateOfferHandler implements ContextUseCase<UpdateOfferDataContext> {

  private final ScenarioSteps scenarioSteps;

  private final OfferPersistencePort offerPersistencePort;

  @Override
  public void handle(UpdateOfferDataContext context) {
    var request = context.getRequest();
    // Maybe if we will use that approach we can migrate all intervals to context and write a kind of preProcessor
    // that will fetch all existing offers from database for that rules
    var offersMap = request.getOffers().stream()
        .collect(Collectors.toMap(RegistrationOfferCommand::getInterval, Function.identity()));
    var intervals = offersMap.keySet().stream().toList();
    var registrationId = request.getRegistrationId();

    var offers = offerPersistencePort.findAllByRegistrationIdAndIntervalIn(registrationId, intervals);
    context.setOffers(offers);

    offers.forEach(offer -> {
      var updatedOffer = offersMap.get(offer.getInterval());
      offer.setVolume(updatedOffer.getVolume());
      offer.setPrice(updatedOffer.getPrice());
      offer.setVolumeUnit(updatedOffer.getVolumeUnit());
      offer.setDocumentType(updatedOffer.getDocumentType());
    });

    // check if volume doesn't exceed the threshold for example
    context.accept(scenarioSteps.getMarketOfferPersistentVisitor());
  }
}
