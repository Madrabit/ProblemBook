package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCleaner8Test {

    @Test
    void eraseSpaces() {
        assertEquals("abc", new SpaceCleaner8().eraseSpaces(" a b c "));
    }
}