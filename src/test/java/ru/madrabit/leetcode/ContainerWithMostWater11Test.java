package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWater11Test {

    @Test
    void maxArea() {
        final int result = ContainerWithMostWater11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, result);

    }
}
