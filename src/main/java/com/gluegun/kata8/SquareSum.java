package com.gluegun.kata8;

import java.util.Arrays;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 * <p>
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(e -> (int) Math.pow(e, 2)).sum();
    }
}
