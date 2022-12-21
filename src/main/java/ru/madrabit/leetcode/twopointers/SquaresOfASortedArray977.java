package ru.madrabit.leetcode.twopointers;

public class SquaresOfASortedArray977 {
    public static int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1, index = r;
        int[] result = new int[nums.length];
        while (index >= 0) {
            int rPow = (int) Math.pow(nums[r], 2);
            int lPow = (int) Math.pow(nums[l], 2);
            if ( rPow > lPow) {
                result[index--] = rPow;
                r--;
            } else {
                result[index--] = lPow;
                l++;
            }

        }
        return result;
    }
}
