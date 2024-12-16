package com.enel.momoffermanipulation.application.port.outbound;

import com.enel.momoffermanipulation.application.domain.RegistrationOfferEntity;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public interface OfferPersistencePort {

  RegistrationOfferEntity findById(Long id);

  //  TODO: Or apply the same approach as in mom to store interval as number
  List<RegistrationOfferEntity> findAllByRegistrationIdAndIntervalIn(UUID registrationId,
      List<OffsetDateTime> interval);

  List<RegistrationOfferEntity> findByStartAndEndTime(OffsetDateTime start, OffsetDateTime end);

  RegistrationOfferEntity save(RegistrationOfferEntity siteOfferEntity);

  List<RegistrationOfferEntity> saveAll(List<RegistrationOfferEntity> siteOfferEntity);
}
