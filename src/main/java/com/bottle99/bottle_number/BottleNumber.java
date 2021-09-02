package com.bottle99.bottle_number;

public interface BottleNumber {

  BottleNumber successor();

  String phrase();

  String action();

  static BottleNumber forVerseNumber(int verseNumber) {
    switch (verseNumber) {
      case 0:
        return new BottleNumber0();
      case 1:
        return new BottleNumber1();
      case 6:
        return new BottleNumber6();
      default:
        return new BottleNumberDefault(verseNumber);
    }
  }
}
