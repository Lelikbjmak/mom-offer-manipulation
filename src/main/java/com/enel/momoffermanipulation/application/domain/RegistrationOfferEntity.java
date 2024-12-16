package com.enel.momoffermanipulation.application.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationOfferEntity {

  private Long id;
  private Double volume;
  private BigDecimal price;
  private VolumeUnit volumeUnit;
  private OffsetDateTime interval;
  private DocumentType documentType;
}
