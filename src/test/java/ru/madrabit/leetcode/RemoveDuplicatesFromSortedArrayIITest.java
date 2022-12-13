package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    void removeDuplicates() {
        final int result = RemoveDuplicatesFromSortedArrayII
                .removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        assertEquals(7, result);
    }
}
