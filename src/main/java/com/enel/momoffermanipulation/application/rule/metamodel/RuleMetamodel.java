package com.enel.momoffermanipulation.application.rule.metamodel;

import com.enel.momoffermanipulation.application.rule.model.RuleExecutionModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RuleMetamodel {

  private RuleExecutionModel<?> executionModel;
}
