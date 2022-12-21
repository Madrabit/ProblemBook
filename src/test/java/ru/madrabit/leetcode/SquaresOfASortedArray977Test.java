package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;
import ru.madrabit.leetcode.twopointers.SquaresOfASortedArray977;

import java.util.Arrays;

class SquaresOfASortedArray977Test {

    @Test
    void sortedSquares() {
        final int[] ints = SquaresOfASortedArray977.sortedSquares(new int[]{-5,-3,-2,-1});
        System.out.println(Arrays.toString(ints));
    }
}
