package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        int k = RemoveDuplicatesFromSortedArray
                .removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        assertEquals(5 , k);
    }
}
