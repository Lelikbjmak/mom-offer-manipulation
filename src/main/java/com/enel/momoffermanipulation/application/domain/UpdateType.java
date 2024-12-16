package com.enel.momoffermanipulation.application.domain;

import com.enel.momoffermanipulation.application.util.Constants;

public enum UpdateType {
  CURTAILMENT(Constants.COL_VOLUME, false),
  DERATING_FACTOR("derating_factor", false),
  @Deprecated MAX_USAGE(Constants.COL_VOLUME, false),
  ADD_OFFER("", false),
  REMOVE_OFFER("", false),
  REJECT_OFFER("", false),
  INVALID("", false),
  CONFIRM_CLEARED("", false),
  @Deprecated CURTAILMENT_RESET("", false),
  COARSE("coarse_volume", false),
  FINE("fine_volume", false),
  BAND_PRICE("price", false),
  BAND_PRICE_3("price_3", false),
  BAND_PRICE_4("price_4", false),
  BAND_PRICE_5("price_5", false),
  ENERGY_PRICE("energy_price", false),
  MO_FLEX_FIELD_1("flex_field_1", false),
  MO_FLEX_FIELD_2("flex_field_2", false),
  MO_FLEX_FIELD_3("flex_field_3", false),
  MO_FLEX_FIELD_4("flex_field_4", false),
  MO_FLEX_FIELD_5("flex_field_5", false),
  MO_FLEX_FIELD_TEXT_1("flex_field_text_1", true),
  MO_FLEX_FIELD_TEXT_2("flex_field_text_2", true),
  MO_FLEX_FIELD_TEXT_3("flex_field_text_3", true),
  MO_FLEX_FIELD_TEXT_4("flex_field_text_4", true),
  MO_FLEX_FIELD_TEXT_5("flex_field_text_5", true),
  MO_VOLUME(Constants.COL_VOLUME, false),
  BASELINE("baseline", false);

  private final String dbFieldName;
  private final boolean isTextField;

  UpdateType(String dbFieldName, boolean isTextField) {
    this.dbFieldName = dbFieldName;
    this.isTextField = isTextField;
  }

  public String getDbFieldName() {
    return dbFieldName;
  }

  public boolean isTextField() {
    return this.isTextField;
  }
}
