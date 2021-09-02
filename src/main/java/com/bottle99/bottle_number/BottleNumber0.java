package com.bottle99.bottle_number;

class BottleNumber0 implements BottleNumber {

  @Override
  public BottleNumber successor() {
    return BottleNumber.forVerseNumber(99);
  }

  @Override
  public String phrase() {
    return "no more bottles";
  }

  @Override
  public String action() {
    return "Go to the store and buy some more";
  }
}
