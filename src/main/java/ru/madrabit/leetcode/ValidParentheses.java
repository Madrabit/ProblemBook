package ru.madrabit.leetcode;

public class ValidParentheses {
    public static boolean isValid(String s) {
        //TODO сделать через Стэк или Deque
        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        final boolean valid = isValid(s);
        System.out.println("Expected true: " + valid);

        String s2 = "()[]{}";
        final boolean valid2 = isValid(s2);
        System.out.println("Expected true: " + valid2);

        String s3 = "(]";
        final boolean valid3 = isValid(s3);
        System.out.println("Expected false: " + valid3);

        String s4 = "([)]";
        final boolean valid4 = isValid(s4);
        System.out.println("4 Expected false: " + valid4);

        String s5 = "{[]}";
        final boolean valid5 = isValid(s5);
        System.out.println("5 Expected true: " + valid5);

        String s6 = "((";
        final boolean valid6 = isValid(s6);
        System.out.println("Expected false: " + valid6);

        String s7 = "(){}}{";
        final boolean valid7 = isValid(s7);
        System.out.println("Expected false: " + valid7);

        String s8 = "([])";
        final boolean valid8 = isValid(s8);
        System.out.println("Expected true: " + valid8);

        String s9 = "{[}]";
        final boolean valid9 = isValid(s9);
        System.out.println("9 Expected false: " + valid9);


    }
}


