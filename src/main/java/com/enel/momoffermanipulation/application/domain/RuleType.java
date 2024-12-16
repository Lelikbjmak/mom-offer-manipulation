package com.enel.momoffermanipulation.application.domain;

import com.enel.momoffermanipulation.application.util.StringUtils;
import java.util.Optional;

public enum RuleType {
  AGGREGATED_AVAILABILITY,
  CLEARED_OFFER_ALLOCATION,
  CLEARED_OFFER_FILE_UPLOAD,
  CLEARED_OFFER_PRICES,
  MARKET_OFFER_CONFIRMATION,
  MARKET_OFFER_SUBMISSION_RESPONSE,
  PRE_MARKET_OFFER_SUBMISSION,
  POST_MARKET_OFFER_SUBMISSION,
  OFFER_AGGREGATION,
  OFFER_PRICE_EDIT,
  OFFER_VOLUME_EDIT,
  REDECLARATION_EVENT_LOGGING,
  REOFFERING,
  INVALID;

  public static RuleType parseRuleType(String ruleType) {
    return Optional.ofNullable(ruleType)
        .map(StringUtils::toUpperTrimmed)
        .map(RuleType::valueOf)
        .orElse(RuleType.INVALID);
  }
}
