package com.enel.momoffermanipulation.application.port.inbound.scenario;

import com.enel.momoffermanipulation.application.port.inbound.scenario.context.Context;
import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.ContextVisitor;

public interface UseCase<T, R, C extends Context<T, R, ContextVisitor>> {

  R handle(T t);
}
