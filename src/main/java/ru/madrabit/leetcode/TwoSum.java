package ru.madrabit.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int [] arrResult = new int[2];
        if (nums.length == 0 || nums.length == 1) {
            return null;
        } else if (nums.length == 2) {
            if (nums[0] == target - nums[1]) {
                arrResult[0] = 0;
                arrResult[1] = 1;
                return arrResult;
            }
        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == target - nums[j]) {
//                    arrResult[0] = i;
//                    arrResult[1] = j;
//                    return arrResult;
//                }
//            }
//        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                arrResult[0] = map.get(diff);
                arrResult[1] = i;
                return arrResult;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;

    }

    public static void main(String[] args) {

        final int[] ints = {2, 7, 11, 15};
        final int[] sum = twoSum(ints, 9);
        System.out.println(sum[0] + " " + sum[1]);

        final int[] ints2 = {3,2,4};
        final int[] sum2 = twoSum(ints2, 6);
        System.out.println(sum2[0] + " " + sum2[1]);

        final int[] ints3 = {3,3};
        final int[] sum3 = twoSum(ints3, 6);
        System.out.println(sum3[0] + " " + sum3[1]);
    }
}
