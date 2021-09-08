package com.gluegun.kata8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeepHydratedTest {
    KeepHydrated kh = new KeepHydrated();

    @Test
    public void SampleTest1() {
        assertEquals(1, kh.Liters(2));
        assertEquals(40, kh.Liters(80));
        assertEquals(0, kh.Liters(0.97));
        assertEquals(7, kh.Liters(14.64));
        assertEquals(800, kh.Liters(1600.20));
    }

    @Test
    public void SampleTest2() {
        assertEquals(2, kh.Liters(5.777543521331085));
    }

}
