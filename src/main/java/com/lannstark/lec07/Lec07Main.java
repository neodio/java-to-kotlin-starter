package com.lannstark.lec07;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
  }

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다."));
    }
  }

  private int parseIntOrThrow2(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw null;
    }
  }

}
