package ru.madrabit.leetcode;

import org.junit.jupiter.api.Test;
import ru.madrabit.leetcode.twopointers.TwoSum2Medium;

class TwoSum2MediumTest {

    @Test
    void twoSum() {
        final int[] ints = {2, 7, 11, 15};
        final int[] sum = TwoSum2Medium.twoSum(ints, 9);
        System.out.println(sum[0] + " " + sum[1]);
    }
}
