package com.enel.momoffermanipulation.application.port.inbound.scenario;

import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.MarketOfferPersistentVisitor;
import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.MarketRuleExecutorVisitor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ScenarioSteps {

  private final MarketRuleExecutorVisitor marketRuleExecutorVisitor;

  private final MarketOfferPersistentVisitor marketOfferPersistentVisitor;
}
