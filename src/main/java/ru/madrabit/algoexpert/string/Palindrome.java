package ru.madrabit.algoexpert.string;

public class Palindrome {

    public static boolean checkPalindrome(String str) {
        final char[] chars = str.toCharArray();
        final int strLen = (str.length() - 1);
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (chars[i] != chars[chars.length - i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < strLen / 2; i++) {
                if (chars[i] != chars[chars.length - i - 1]) {
                    return false;
                }
            }           
        }
        return true;
    }

}
