package com.bottle99.bottle_number;

public class BottleNumber6 implements BottleNumber {

  @Override
  public BottleNumber successor() {
    return BottleNumber.forVerseNumber(5);
  }

  @Override
  public String phrase() {
    return "1 six-pack";
  }

  @Override
  public String action() {
    return "Take one down and pass it around";
  }
}
