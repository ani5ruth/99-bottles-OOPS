package com.bottle99;

import com.bottle99.bottle_number.BottleNumber;
import java.text.MessageFormat;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.NONE)
public class BottlesOfBeerPoem {

  public static String song() {
    return IntStream.rangeClosed(0, 99).boxed().sorted(Comparator.reverseOrder())
        .map(BottlesOfBeerPoem::verse)
        .collect(Collectors.joining("\n"));
  }

  public static String verse(int verseNumber) {
    final BottleNumber bottleNumber = BottleNumber.forVerseNumber(verseNumber);
    final BottleNumber nextBottleNumber = bottleNumber.successor();
    return StringUtils.capitalize(MessageFormat.format(
        "{0} of beer on the wall, {0} of beer.\n{1}, {2} of beer on the wall.",
        bottleNumber.phrase(),
        bottleNumber.action(),
        nextBottleNumber.phrase()
    ));
  }
}
