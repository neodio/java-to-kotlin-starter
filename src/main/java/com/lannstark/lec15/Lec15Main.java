package com.lannstark.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {

  public static void main(String[] args) {
    // array

    int[] array = {100, 200};

    for (int i = 0; i < array.length; i++) {
      System.out.printf("%s %s", i, array[i]);
    }

    // List

    final List<Integer> numbers = Arrays.asList(100, 200);

    // Map

    // jdk 8까지
    HashMap<Integer, String> oldMap = new HashMap<>();
    oldMap.put(1, "MONDAY");
    oldMap.put(2, "TUESDAY");

    // jdk 9부터
    Map.of(1, "MONDAY", 2, "TUESDAY");
  }


}
