package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedCharsTest {

    @Test
    void countChars() {
        String word = "aaAFasfaFnmm";
        final int result = RepeatedChars.countChars(word);
        assertEquals(8, result);
    }

    @Test
    void countChars2() {
        String word = "aaAFasfaFnmm";
        final long result = RepeatedChars.countChars2(word);
        assertEquals(8L, result);
    }
}
