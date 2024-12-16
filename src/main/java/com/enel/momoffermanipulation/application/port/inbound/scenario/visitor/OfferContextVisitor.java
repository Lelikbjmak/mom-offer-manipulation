package com.enel.momoffermanipulation.application.port.inbound.scenario.visitor;

import com.enel.momoffermanipulation.application.port.inbound.scenario.context.UpdateOfferDataContext;

public interface OfferContextVisitor extends ContextVisitor {

  default void visit(UpdateOfferDataContext context) {
  }

}
