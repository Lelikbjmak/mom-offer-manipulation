package com.enel.momoffermanipulation.application.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProgramBandCalculationType {

  A("Absolute"),
  P("Proportional");

  private final String value;
}
