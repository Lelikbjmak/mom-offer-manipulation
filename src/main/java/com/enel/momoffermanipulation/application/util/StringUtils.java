package com.enel.momoffermanipulation.application.util;

import java.util.Optional;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Nullable;

@UtilityClass
public final class StringUtils {

  @Nullable
  public static String toUpperTrimmed(@Nullable String string) {
    return Optional.ofNullable(string)
        .map(String::trim)
        .map(String::toUpperCase)
        .orElse(null);
  }

  public static boolean isNullOrEmpty(String string) {
    return org.apache.commons.lang3.StringUtils.isBlank(string);
  }

  public static boolean isNullOrWhitespace(String string) {
    return Optional.ofNullable(string)
        .map(String::trim)
        .map(StringUtils::isNullOrEmpty)
        .orElse(true);
  }
}
