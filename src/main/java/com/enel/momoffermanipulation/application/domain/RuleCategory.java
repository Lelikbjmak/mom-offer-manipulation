package com.enel.momoffermanipulation.application.domain;

import com.enel.momoffermanipulation.application.util.StringUtils;
import java.util.Optional;

public enum RuleCategory {
  SELECT,
  UPDATE,
  VALIDATE,
  INVALID;

  public static RuleCategory parseRuleType(String ruleType) {
    return Optional.ofNullable(ruleType)
        .map(StringUtils::toUpperTrimmed)
        .map(RuleCategory::valueOf)
        .orElse(RuleCategory.INVALID);
  }

}
