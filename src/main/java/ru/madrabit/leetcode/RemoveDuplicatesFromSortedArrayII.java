package ru.madrabit.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int l =0, r = 1, counter = 0;
        while (r < nums.length) {
            if (nums[l] != nums[r]) {
                nums[++l] = nums[r];
                counter = 0;
            } else if (nums[l] == nums[r] && counter < 1) {
                nums[++l] = nums[r];
                counter++;
            }
            r++;
        }
        return l + 1;
    }
}
