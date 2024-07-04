package ru.madrabit.leonard.chapter1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {

    @Test
    void counter() {
        CountVowels countVowels = new CountVowels();
        Map<String, Integer> result = countVowels.counter("asdqee");
        assertEquals(3, result.get("vowels"));
    }
}