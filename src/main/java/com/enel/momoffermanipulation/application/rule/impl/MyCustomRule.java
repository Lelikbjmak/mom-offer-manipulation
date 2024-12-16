package com.enel.momoffermanipulation.application.rule.impl;

import com.enel.momoffermanipulation.application.rule.ReportEntity;
import com.enel.momoffermanipulation.application.rule.RuleExecution;
import com.enel.momoffermanipulation.application.rule.metamodel.UpdateOfferMetamodel;

public class MyCustomRule implements RuleExecution<UpdateOfferMetamodel> {

  @Override
  public ReportEntity execute(UpdateOfferMetamodel ruleMetamodel) {
    var a = ruleMetamodel.getExecutionModel().getRequest();
    return ReportEntity.builder()
        .success(true)
        .build();
  }
}
