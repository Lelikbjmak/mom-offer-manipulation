package com.enel.momoffermanipulation.application.port.inbound.scenario.context;

import com.enel.momoffermanipulation.application.domain.Program;
import com.enel.momoffermanipulation.application.domain.User;
import com.enel.momoffermanipulation.application.port.inbound.scenario.visitor.ContextVisitor;

public interface Context<T, R, V extends ContextVisitor> {

  T getRequest();

  R getResponse();

  User getUser();

  Program getProgram();

  void accept(V visitor);
}
