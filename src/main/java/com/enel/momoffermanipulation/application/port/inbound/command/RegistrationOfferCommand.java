package com.enel.momoffermanipulation.application.port.inbound.command;

import com.enel.momoffermanipulation.application.domain.DocumentType;
import com.enel.momoffermanipulation.application.domain.VolumeUnit;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationOfferCommand {

  private double volume;

  private BigDecimal price;

  private VolumeUnit volumeUnit;

  private OffsetDateTime interval;

  private DocumentType documentType; // do we need it right here???
}
