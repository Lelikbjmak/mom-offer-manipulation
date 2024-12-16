package com.enel.momoffermanipulation.application.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Constants {

  public static final String LEVEL_GROUP = "GROUP";
  public static final String LEVEL_PORTFOLIO = "PORTFOLIO";
  public static final String LEVEL_REGISTRATION = "REGISTRATION";
  public static final String LEVEL_ALL = "ALL";

  public static final String PARAM_PORTFOLIO_ID = "portfolio_id";
  public static final String PARAM_PRODUCT_CODE = "product";
  public static final String PARAM_PRODUCT_ID = "product_id";

  public static final String UOM_MEGAWATTS = "MW";
  public static final String UOM_KILOWATTS = "KW";

  public static final String UPDATE_TYPE_CURTAILMENT = "CURTAILDATA";
  public static final String UPDATE_TYPE_DERATING_FACTOR = "DERATINGFACTOR";
  @Deprecated
  public static final String UPDATE_TYPE_MAX_USAGE = "MAXUSAGEDATA";
  @Deprecated
  public static final String UPDATE_TYPE_RESET_CURTAILMENT = "RESETCURTAILMENT";
  public static final String UPDATE_TYPE_ADD_OFFER = "ADD";
  public static final String UPDATE_TYPE_REMOVE_OFFER = "REMOVE";
  public static final String UPDATE_TYPE_REJECT_OFFER = "REJECT";
  public static final String UPDATE_TYPE_CONFIRM_CLEARED_OFFER = "CONFIRM";

  public static final String UPDATE_TYPE_FINE = "FINEDATA";
  public static final String UPDATE_TYPE_COARSE = "COARSEDATA";
  public static final String UPDATE_TYPE_BAND_PRICE = "PRICEDATA";
  public static final String UPDATE_TYPE_BAND_PRICE_3 = "PRICE3DATA";
  public static final String UPDATE_TYPE_BAND_PRICE_4 = "PRICE4DATA";
  public static final String UPDATE_TYPE_BAND_PRICE_5 = "PRICE5DATA";
  public static final String UPDATE_TYPE_ENERGY_PRICE = "ENERGYPRICEDATA";
  public static final String UPDATE_TYPE_BASELINE = "BASELINEDATA";

  public static final String UPDATE_TYPE_MO_FLEX_FIELD_1 = "MOFLEXFIELD1DATA";
  public static final String UPDATE_TYPE_MO_FLEX_FIELD_2 = "MOFLEXFIELD2DATA";
  public static final String UPDATE_TYPE_MO_FLEX_FIELD_3 = "MOFLEXFIELD3DATA";
  public static final String UPDATE_TYPE_MO_FLEX_FIELD_4 = "MOFLEXFIELD4DATA";
  public static final String UPDATE_TYPE_MO_FLEX_FIELD_5 = "MOFLEXFIELD5DATA";

  public static final String METADATA_KEY_CLEARED_OFFER = "cleared_offer";

  public static final String MSG_RULE_CONFLICT =
      "Request could not be completed due to business rule conflict";
  public static final String MSG_INTERNAL_ERROR =
      "Request processing failed unexpectedly due to an internal server error";
  public static final String MSG_PROCESS_RESULT_SET_ERROR =
      "Error occurred during processing of the result set: ";

  public static final String OK = "OK";

  public static final String ATTR_ERROR = "error";
  public static final String ATTR_ERROR_DESCRIPTION = "error_description";

  public static final String COL_OMS_GROUP_ID = "oms_group_id";
  public static final String COL_OMS_EQUIPMENT_GROUPING_ID = "oms_equipment_grouping_id";
  public static final String COL_OMS_PORTFOLIO_ID = "oms_portfolio_id";
  public static final String COL_VOLUME = "volume";
  public static final String COL_UTC_TIMESTAMP_NUMBER = "utc_timestamp_number";

  public static final String ALERT_TYPE_CUSTOMER_OFFERS = "Customer Offer";
  public static final String ALERT_NAME_CUSTOMER_OFFERS = "Customer Offer";

  public static final String CHARSET_UTF8 = "utf-8";
  public static final String CONTENT_TYPE_JSON = "application/json";

  public static final String DISPLAY_LABELS = "display_labels";
  public static final String TOOL_TIP_DISPLAY_LABELS = "tool_tip_display_labels";
  public static final String CHART_DISPLAY_LABELS = "chart_display_labels";
  public static final String NEW_LINE = "\r\n";

  /*
   * This value is substituted for 0 to ensure it is displayed in the UI chart
   */
  public static final double ZERO_VALUE_FOR_CHARTING = 0.0;

}
