package ru.madrabit.leetcode.twopointers;

public class SortColors75 {

    public static int[] sortColors(int[] nums) {
        int l = 0, n = nums.length, r = n - 1, cur = 0;

        while (cur <= r) {
            if (nums[cur] == 2) {
                swap(nums, cur, r);
                r--;
            } else if (nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, l);
                cur++;
                l++;
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int fst, int sec) {
        int tmp = arr[fst];
        arr[fst] = arr[sec];
        arr[sec] = tmp;
    }



}
