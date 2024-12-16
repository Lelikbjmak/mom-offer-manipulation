package com.enel.momoffermanipulation.application.port.inbound.scenario.visitor;

import com.enel.momoffermanipulation.application.port.inbound.scenario.context.UpdateOfferDataContext;
import com.enel.momoffermanipulation.application.port.outbound.OfferPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MarketOfferPersistentVisitor implements OfferContextVisitor {

  private final OfferPersistencePort offerPersistencePort;

  @Override
  public void visit(UpdateOfferDataContext context) {
    save(context);
  }

  private void save(UpdateOfferDataContext context) {
    offerPersistencePort.saveAll(context.getOffers());
  }
}
