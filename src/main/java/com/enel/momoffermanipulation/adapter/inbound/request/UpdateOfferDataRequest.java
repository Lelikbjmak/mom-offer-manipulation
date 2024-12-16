package com.enel.momoffermanipulation.adapter.inbound.request;

import com.enel.momoffermanipulation.application.port.inbound.command.RegistrationOfferCommand;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOfferDataRequest {

  private UUID registrationId;
  private List<RegistrationOfferCommand> offers;
}
