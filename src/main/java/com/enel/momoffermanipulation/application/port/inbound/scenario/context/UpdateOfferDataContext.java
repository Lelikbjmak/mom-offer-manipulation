package com.enel.momoffermanipulation.application.port.inbound.scenario.context;

import com.enel.momoffermanipulation.application.domain.Program;
import com.enel.momoffermanipulation.application.domain.RegistrationOfferEntity;
import com.enel.momoffermanipulation.application.domain.User;
import com.enel.momoffermanipulation.application.port.inbound.command.request.UpdateOfferDataCommand;
import com.enel.momoffermanipulation.application.port.inbound.command.response.UpdateOfferDataCommandResponse;
import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.OfferContextVisitor;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdateOfferDataContext implements
    OfferContext<UpdateOfferDataCommand, UpdateOfferDataCommandResponse> {

  private UpdateOfferDataCommand request;
  private UpdateOfferDataCommandResponse response;

  private List<RegistrationOfferEntity> offers;

  @Override
  public UpdateOfferDataCommand getRequest() {
    return request;
  }

  @Override
  public UpdateOfferDataCommandResponse getResponse() {
    return response;
  }

  @Override
  public User getUser() {
    //    persist from request
    return null;
  }

  @Override
  public Program getProgram() {
    //    persist from request
    return null;
  }

  @Override
  public void accept(OfferContextVisitor visitor) {
    visitor.visit(this);
  }
}
