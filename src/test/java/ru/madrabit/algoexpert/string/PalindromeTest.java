package ru.madrabit.algoexpert.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PalindromeTest {

    @Test
    public void checkPalindromeEven() {
        final boolean result = Palindrome.checkPalindrome("abccba");
        assertTrue(result);
    }

    @Test
    public void checkPalindromeOdd() {
        final boolean result = Palindrome.checkPalindrome("abcdcba");
        assertTrue(result);
    }
}
