package ru.madrabit.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfEventsThatCanBeAttended1353Test {

    @Test
    void maxEvents() {
        final int result = MaximumNumberOfEventsThatCanBeAttended1353.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}});
        assertEquals(3, result);
    }
}
