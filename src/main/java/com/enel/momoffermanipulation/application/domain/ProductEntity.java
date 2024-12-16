package com.enel.momoffermanipulation.application.domain;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

  private Long id;
  private String code;
  private String name;
  private String sourceCode;
  private Boolean defaultSelected;
  private Map<String, String> alternateIds;
  private Map<String, String> marketConfig;
}
