package ru.madrabit.leetcode.slidingwindow;

import java.util.stream.IntStream;

public class SubstringsOfSizeThreeWithDistinctCharacters1876 {
    public static int countGoodSubstrings(String s) {
        final String[] split = "".split(s);
        int count = (int) IntStream.range(0, split.length - 2)
                .filter(i -> !split[i].equals(split[i + 1]) &&
                !split[i + 1].equals(split[i + 2]) &&
                !split[i].equals(split[i + 2]))
                .count();
        return count;
    }

    public static void main(String[] args) {
        final int result = countGoodSubstrings("xyzzaz");
        System.out.println(result);
    }
}
