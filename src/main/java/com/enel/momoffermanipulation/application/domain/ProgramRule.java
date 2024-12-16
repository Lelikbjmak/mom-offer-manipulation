package com.enel.momoffermanipulation.application.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ProgramRule {

  private Long programId;
  private Long productId;
  private Long portfolioId;
  private RuleType ruleType;
  private List<String> ruleNames;
  private RuleCategory ruleCategory;
}