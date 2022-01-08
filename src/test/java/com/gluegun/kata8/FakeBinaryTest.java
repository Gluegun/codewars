package com.gluegun.kata8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeBinaryTest {

    @Test
    public void testFakeBinary() {

        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
    }

}
