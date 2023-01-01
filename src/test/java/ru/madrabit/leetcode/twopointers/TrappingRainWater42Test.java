package ru.madrabit.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWater42Test {

    @Test
    void trap() {
        final int result = TrappingRainWater42.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        assertEquals(6, result);
    }
}
