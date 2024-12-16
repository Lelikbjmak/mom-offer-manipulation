package com.enel.momoffermanipulation.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProgramBand {

  private double bandNumber;
  private String nameEn;
  private String nameLocal;
  private double volumeAllocation;
  private double price;
  private double energyPrice;
}
