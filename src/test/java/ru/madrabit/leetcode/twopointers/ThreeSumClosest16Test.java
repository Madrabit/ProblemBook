package ru.madrabit.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosest16Test {

    @Test
    void threeSumClosest() {
        final int[] num1 = {-1,2,1,-4};
        final int result = ThreeSumClosest16.threeSumClosest(num1, 1);
        final int[] num2 = {1,1,1,0};
        final int result2 = ThreeSumClosest16.threeSumClosest(num2, 1);
        assertEquals(2, result);
        assertEquals(2, result2);
    }
}
