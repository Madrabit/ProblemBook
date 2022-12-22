package ru.madrabit.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> triplets = new ArrayList<>();
        int gap = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n; i++) {
            //skip duplicate
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int currentGap = Math.abs(sum - target);
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
                if (currentGap < gap) {
                    result = sum;
                    gap = currentGap;
                }
            }

        }
        return result;
    }
}
