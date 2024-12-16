package com.enel.momoffermanipulation.application.port.inbound.scenario;

public interface ContextUseCase<C> {

  void handle(C context);
}
