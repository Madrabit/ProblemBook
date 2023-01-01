package ru.madrabit.leetcode.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TrappingRainWater42 {
    public static int trap(int[] height) {
        int max = 0, leftMax = 0, rightMax = height.length - 1, sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[max] < height[i]) {
                max = i;
            }
        }
        for (int i = 0; i < max; i++) {
            if (height[leftMax] < height[i]) {
                leftMax = i;
            }
            sum += height[leftMax] - height[i];
        }
        for (int i = height.length - 1; i > max; i--) {
            if(height[rightMax] < height[i]) {
                rightMax = i;
            }
            sum += height[rightMax] - height[i];
        }

        return sum;
    }
}
