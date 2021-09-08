package com.gluegun.kata8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OppositesAttractTest {

    @Test
    @DisplayName("Odd number of petals on the one flower and even on another")
    public void testKataTrue() {

        int petalsAmountOfFlower1 = 1;
        int petalsAmountOfFlower2 = 4;
        assertTrue(OppositesAttract.isLove(petalsAmountOfFlower1, petalsAmountOfFlower2));

    }

    @Test
    @DisplayName("Odd number of petals on both flowers")
    public void testKataFalse() {

        int petalsAmountOfFlower1 = 2;
        int petalsAmountOfFlower2 = 2;
        assertFalse(OppositesAttract.isLove(petalsAmountOfFlower1, petalsAmountOfFlower2));

    }

}
