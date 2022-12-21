package ru.madrabit.leetcode.twopointers;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int l = 0, r = 1, count = 0;
        while (r < nums.length) {
            if(nums[l] == nums[r]){
                r++;
            }else if(nums[l] != nums[r]){
                nums[++l] = nums[r];
            }
        }
        return l + 1;
    }
}
