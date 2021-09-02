package com.bottle99.bottle_number;

import java.text.MessageFormat;

public class BottleNumberDefault implements BottleNumber {

  private final int number;

  BottleNumberDefault(int number) {
    this.number = number;
  }

  @Override
  public BottleNumber successor() {
    return BottleNumber.forVerseNumber(number - 1);
  }

  @Override
  public String phrase() {
    return MessageFormat.format("{0} bottles", number);
  }

  @Override
  public String action() {
    return "Take one down and pass it around";
  }
}
