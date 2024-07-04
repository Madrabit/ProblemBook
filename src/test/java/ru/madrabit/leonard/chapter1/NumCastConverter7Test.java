package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumCastConverter7Test {

    @Test
    void convert() {
        assertEquals(123, new NumCastConverter7().convert("123"));
    }
}