package com.enel.momoffermanipulation.application.port.inbound.scenario.usecase.updatedataoffer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.enel.momoffermanipulation.application.domain.DocumentType;
import com.enel.momoffermanipulation.application.domain.RegistrationOfferEntity;
import com.enel.momoffermanipulation.application.domain.VolumeUnit;
import com.enel.momoffermanipulation.application.port.inbound.command.RegistrationOfferCommand;
import com.enel.momoffermanipulation.application.port.inbound.command.request.UpdateOfferDataCommand;
import com.enel.momoffermanipulation.application.port.inbound.scenario.ScenarioSteps;
import com.enel.momoffermanipulation.application.port.inbound.scenario.context.UpdateOfferDataContext;
import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.MarketOfferPersistentVisitor;
import com.enel.momoffermanipulation.application.port.outbound.OfferPersistencePort;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UpdateOfferHandlerTest {

  @Mock
  private ScenarioSteps scenarioSteps;

  @Mock
  private OfferPersistencePort offerPersistencePort;

  @InjectMocks
  private UpdateOfferHandler updateOfferHandler;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testHandle_updatesOffersAndCallsAccept() {
    // given
    var firstInterval = OffsetDateTime.parse("2024-12-03T10:15:30+01:00");
    var secondInterval = OffsetDateTime.parse("2024-12-03T11:15:30+01:00");
    RegistrationOfferCommand offer1 = new RegistrationOfferCommand(2.10, BigDecimal.valueOf(54.00),
        VolumeUnit.MW, firstInterval, DocumentType.ZPP);
    RegistrationOfferCommand offer2 = new RegistrationOfferCommand(3.10, BigDecimal.valueOf(55.00),
        VolumeUnit.MW, secondInterval, DocumentType.ZPP);

    var context = UpdateOfferDataContext.builder()
        .request(new UpdateOfferDataCommand(UUID.randomUUID(), List.of(offer1, offer2)))
        .build();

    RegistrationOfferEntity existingOffer1 = new RegistrationOfferEntity(1L, 1.1, BigDecimal.valueOf(30.5),
        VolumeUnit.KW, firstInterval, DocumentType.ZOMB);
    RegistrationOfferEntity existingOffer2 = new RegistrationOfferEntity(2L, 1.2, BigDecimal.valueOf(20.5),
        VolumeUnit.KW, secondInterval, DocumentType.ZOMB);
    List<RegistrationOfferEntity> existingOffers = List.of(existingOffer1, existingOffer2);

    var persistenceVisitor = new MarketOfferPersistentVisitor(offerPersistencePort);
    when(offerPersistencePort.findAllByRegistrationIdAndIntervalIn(any(), anyList())).thenReturn(existingOffers);
    when(scenarioSteps.getMarketOfferPersistentVisitor()).thenReturn(persistenceVisitor);

    // When
    updateOfferHandler.handle(context);

    // Then
    assertEquals(2.1, existingOffer1.getVolume());
    assertEquals(BigDecimal.valueOf(54.00), existingOffer1.getPrice());
    assertEquals(VolumeUnit.MW, existingOffer1.getVolumeUnit());
    assertEquals(DocumentType.ZPP, existingOffer1.getDocumentType());

    assertEquals(3.1, existingOffer2.getVolume());
    assertEquals(BigDecimal.valueOf(55.00), existingOffer2.getPrice());
    assertEquals(VolumeUnit.MW, existingOffer2.getVolumeUnit());
    assertEquals(DocumentType.ZPP, existingOffer2.getDocumentType());

    // Verify scenarioSteps accept methods are called
    verify(offerPersistencePort, times(1)).findAllByRegistrationIdAndIntervalIn(any(), anyList());
    verify(offerPersistencePort, times(1)).saveAll(anyList());
  }
}