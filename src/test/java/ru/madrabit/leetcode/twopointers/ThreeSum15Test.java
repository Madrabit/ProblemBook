package ru.madrabit.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSum15Test {

    @Test
    void threeSum() {
        final int[] ints = {-1, 0, 1, 2, -1, -4};
        final List<List<Integer>> lists = ThreeSum15.threeSum(ints);
        System.out.println(lists);
    }
}
