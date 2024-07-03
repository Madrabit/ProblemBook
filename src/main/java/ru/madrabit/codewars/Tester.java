package ru.madrabit.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class Tester {


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
           result[i] = map.get(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
            smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }






}
