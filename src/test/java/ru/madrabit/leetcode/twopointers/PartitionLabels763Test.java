package ru.madrabit.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabels763Test {

    @Test
    void partitionLabels() {
        final List<Integer> result = PartitionLabels763.partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(List.of(9,7,8),result);

    }
}
