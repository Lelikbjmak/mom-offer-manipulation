package com.enel.momoffermanipulation.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GateRuleIntervals {

  private long firstPriceEdit;
  private long firstVolumeEdit;
  private long firstVolumeReduce;
  private long currentIntervalNumber;
  private long firstOutsideGateIntervalNumber;
}
