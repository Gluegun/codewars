package com.gluegun.kata8;

import static java.util.stream.Collectors.joining;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
