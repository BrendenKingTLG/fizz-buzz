package com.tlglearing;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "fizz";
  public static final String BUZZ_RESULT = "buzz";

  public static String valueOf(int n) {
    String result = "";
    if (n % 3 == 0) {
      result += FIZZ_RESULT;
    }
    if (n % 5 == 0) {
      result += BUZZ_RESULT;
    }
    if (result.isEmpty()) {
      result += String.valueOf(n);
    }
    return result;
  }

}
