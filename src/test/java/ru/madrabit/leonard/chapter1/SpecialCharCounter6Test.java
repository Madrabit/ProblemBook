package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialCharCounter6Test {

    @Test
    void counter() {
        assertEquals(3, new SpecialCharCounter6().counter("as@da@sf@", '@'));
    }
}