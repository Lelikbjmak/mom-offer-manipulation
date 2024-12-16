package com.enel.momoffermanipulation.application.rule.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RuleExecutionModel<T> {

  private final RuleExecutionRequest<T> request;
}
