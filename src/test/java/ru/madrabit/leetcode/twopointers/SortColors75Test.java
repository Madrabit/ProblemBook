package ru.madrabit.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColors75Test {

    @Test
    void sortColors() {
        final int[] result = SortColors75.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        assertArrayEquals(new int[]{0,0,1,1,2,2}, result);
    }
}
