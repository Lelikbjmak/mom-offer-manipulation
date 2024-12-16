package com.enel.momoffermanipulation.application.rule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReportEntity {

  private boolean success;

  private String message;

  private List<Mismatch> mismatches;

  ReportEntity(boolean success, String message, List<Mismatch> mismatches) {
    this.success = success;
    this.message = message;
    this.mismatches = mismatches;
  }

  public static ReportEntityBuilder builder() {
    return new ReportEntityBuilder();
  }

  public static class ReportEntityBuilder {

    private boolean success;
    private String message;
    private ArrayList<Mismatch> mismatches;

    ReportEntityBuilder() {
    }

    public ReportEntityBuilder success(boolean success) {
      this.success = success;
      return this;
    }

    public ReportEntityBuilder message(String message) {
      this.message = message;
      return this;
    }

    public ReportEntityBuilder mismatch(Mismatch mismatch) {
      if (this.mismatches == null) {
        this.mismatches = new ArrayList<Mismatch>();
      }
      this.mismatches.add(mismatch);
      return this;
    }

    public ReportEntityBuilder mismatches(Collection<? extends Mismatch> mismatches) {
      if (mismatches == null) {
        throw new NullPointerException("mismatches cannot be null");
      }
      if (this.mismatches == null) {
        this.mismatches = new ArrayList<Mismatch>();
      }
      this.mismatches.addAll(mismatches);
      return this;
    }

    public ReportEntityBuilder clearMismatches() {
      if (this.mismatches != null) {
        this.mismatches.clear();
      }
      return this;
    }

    public ReportEntity build() {
      List<Mismatch> mismatches;
      switch (this.mismatches == null ? 0 : this.mismatches.size()) {
        case 0:
          mismatches = java.util.Collections.emptyList();
          break;
        case 1:
          mismatches = java.util.Collections.singletonList(this.mismatches.get(0));
          break;
        default:
          mismatches = java.util.Collections.unmodifiableList(new ArrayList<Mismatch>(this.mismatches));
      }

      return new ReportEntity(this.success, this.message, mismatches);
    }

    public String toString() {
      return "ReportEntity.ReportEntityBuilder(success=" + this.success + ", message=" + this.message + ", mismatches="
          + this.mismatches + ")";
    }
  }
}
