package com.tlglearing;
import java.util.EnumSet;
import java.util.Set;


public enum FizzBuzz {
  // public static final String FIZZ_RESULT = "fizz";
  // public static final String BUZZ_RESULT = "buzz";

  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int num){
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    if (num % 3 == 0) {
      result.add(FIZZ);
    }
    if (num % 5 == 0) {
      result.add(BUZZ);
    }
    return result;
  }
}