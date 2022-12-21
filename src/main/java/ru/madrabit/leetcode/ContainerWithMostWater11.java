package ru.madrabit.leetcode;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int l = 0, n = height.length, r = n - 1;
        int leftH = height[l];
        int rightH = height[r];
        int result = calc(leftH, rightH, n, l, r);
        while (l != r) {
            if (height[l] < height[r]) {
                l++;
                int newCalc = calc(height[l], height[r], n, l, r);
                if (newCalc > result) {
                    result = newCalc;
                }
            } else {
                r--;
                int newCalc = calc(height[l], height[r], n, l, r);
                if (newCalc > result) {
                    result = newCalc;
                }
            }
        }
        return result;
    }

    private static int calc(int leftH, int rightH, int n, int l, int r) {
        int lower = leftH < rightH ? leftH : rightH;
        return lower * (n - l - (n - r));
    }
}
