package com.tlglearing;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

  @Test
  void valueOf() {
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6));
  }

}