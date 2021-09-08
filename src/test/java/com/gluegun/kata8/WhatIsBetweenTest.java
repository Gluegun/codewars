package com.gluegun.kata8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WhatIsBetweenTest {

    @Test
    public void testKata() {
        int a = 1;
        int b = 4;
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsBetween.between(a, b));
    }

}
