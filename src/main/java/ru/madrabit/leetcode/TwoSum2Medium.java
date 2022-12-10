package ru.madrabit.leetcode;

public class TwoSum2Medium {
    public static int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            while (i < j) {
                final int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
                j--;
            }
        }
        return new int[]{a, b};
    }
}
