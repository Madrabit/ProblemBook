package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordInverterTest {

    @Test
    void invert() {
        assertEquals("abc", new WordInverter().invert("cba"));
    }
}