package com.gradle.comp2522;

/**
 * Making a FizzBuzz processor.
 */

public class FizzBuzzProcessor {
  /**
   * This is just for practice.
   *
   * @param args unsed.
   *
   */

  public static void main(String[] args) {
    System.out.println("Hello Paul!");



    for (int i = 1; i <= 100; i++) {
      System.out.println(convert(i));
    }
  }

  /**
   * This is the answer to classic fizzBuzz question.
   *
   * @param fizzBuzz the fizzbuzz value.
   * @return a string of fizzbuzz values.
   */
  public static String convert(int fizzBuzz) {
    if (fizzBuzz % 15 == 0) {
      return "FizzBuzz";
    }
    if (fizzBuzz % 3 == 0) {
      return "Fizz";
    }
    if (fizzBuzz % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(fizzBuzz);
  }
}