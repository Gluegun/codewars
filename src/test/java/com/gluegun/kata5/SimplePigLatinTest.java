package com.gluegun.kata5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SimplePigLatinTest {

    @Test
    public void test() {

        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));

    }
}
