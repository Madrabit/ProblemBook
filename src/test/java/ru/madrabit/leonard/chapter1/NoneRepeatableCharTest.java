package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoneRepeatableCharTest {

    @Test
    void checkRepeatableChar() {
        final String aChar = NoneRepeatableChar.checkNoneRepeatableChar("aaaSSSkFFFs");
        assertEquals("k", aChar);
    }
}
