package com.tlglearing;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

  @Test
  void valueOf_fizz() {
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6));
  }

  @Test
  void valueOf_buzz() {
    assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(10));
  }

  @Test
  void valueOf_fizzbuzz() {
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15));
  }

  @Test
  void valueOf_none() {
    assertEquals(Set.of(), FizzBuzz.valueOf(11));
  }


}