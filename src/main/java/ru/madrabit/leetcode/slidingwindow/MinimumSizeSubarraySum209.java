package ru.madrabit.leetcode.slidingwindow;


/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
public class MinimumSizeSubarraySum209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return 1;
            }
        }
        int sum = 0;
        for (int k = 1; k < nums.length; k++) {
            for (int i = 0; i < nums.length - k; i++) {
                int maxResult = nums[i] + nums[i + k];
                sum = Math.max(sum, maxResult);
                if (sum >= target) {
                    return k + 1;
                }
            }
        }
        return result;
    }



}
