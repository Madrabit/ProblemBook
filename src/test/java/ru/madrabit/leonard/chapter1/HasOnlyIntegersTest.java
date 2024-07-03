package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasOnlyIntegersTest {

    @Test
    void isOnlyNum() {
        assertTrue(new HasOnlyIntegers().isOnlyNum("123"));
        assertFalse(new HasOnlyIntegers().isOnlyNum("1f23"));
    }
}