package com.gluegun.kata8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareSumTest {

    @Test
    public void testKata() {
        assertEquals(9, SquareSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareSum.squareSum(new int[]{5, -3, 4}));
    }

}
