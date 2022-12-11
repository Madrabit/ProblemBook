package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        final int[] result = MoveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1,3,12,0,0}, result);

    }
}
