package com.enel.momoffermanipulation.application.port.inbound.scenario.visitor;

import com.enel.momoffermanipulation.application.port.inbound.scenario.context.UpdateOfferDataContext;
import com.enel.momoffermanipulation.application.rule.metamodel.UpdateOfferMetamodel;

public class MarketRuleExecutorVisitor implements OfferContextVisitor {

  @Override
  public void visit(UpdateOfferDataContext context) {
    var metamodel = UpdateOfferMetamodel.builder()
        .build();
    OfferContextVisitor.super.visit(context);
  }
}
