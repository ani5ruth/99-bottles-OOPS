package com.bottle99.bottle_number;

class BottleNumber1 implements BottleNumber {

  @Override
  public BottleNumber successor() {
    return BottleNumber.forVerseNumber(0);
  }

  @Override
  public String phrase() {
    return "1 bottle";
  }

  @Override
  public String action() {
    return "Take it down and pass it around";
  }
}
