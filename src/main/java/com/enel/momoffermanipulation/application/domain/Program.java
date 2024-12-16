package com.enel.momoffermanipulation.application.domain;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Program {

  private long id;
  private String code;
  private String name;
  private String sourceCode;
  private GateRuleIntervals gateRuleIntervals;

  private List<ProductEntity> products;
  private Map<String, String> params;
  private List<ProgramBand> programBands;
  private Map<String, String> alternateIds;
  private Map<String, ProgramRule> customRules;

  //  Map<String, Portfolio> knownPortfolios = new HashMap<>(); ??
}
