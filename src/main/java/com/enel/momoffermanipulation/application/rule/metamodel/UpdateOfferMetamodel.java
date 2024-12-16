package com.enel.momoffermanipulation.application.rule.metamodel;

public class UpdateOfferMetamodel extends RuleMetamodel {

  UpdateOfferMetamodel() {
  }

  public static UpdateOfferMetamodelBuilder builder() {
    return new UpdateOfferMetamodelBuilder();
  }

  public static class UpdateOfferMetamodelBuilder {

    UpdateOfferMetamodelBuilder() {
    }

    public UpdateOfferMetamodel build() {
      return new UpdateOfferMetamodel();
    }

    public String toString() {
      return "UpdateOfferMetamodel.UpdateOfferMetamodelBuilder()";
    }
  }
}
