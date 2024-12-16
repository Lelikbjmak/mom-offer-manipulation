package com.enel.momoffermanipulation.application.rule;

import com.enel.momoffermanipulation.application.rule.metamodel.RuleMetamodel;

public interface RuleExecution<T extends RuleMetamodel> {

  ReportEntity execute(T ruleMetamodel);
}
