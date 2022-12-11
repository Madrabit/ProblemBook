package ru.madrabit.leetcode;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int l = 0, len = nums.length, r = 1;
        int z = 0;
        while (r < nums.length) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
            }
        }
        return nums;

    }
}
