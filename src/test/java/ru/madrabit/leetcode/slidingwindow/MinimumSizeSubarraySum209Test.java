package ru.madrabit.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySum209Test {

    @Test
    void minSubArrayLen() {
//        final int result = MinimumSizeSubarraySum209
//                .minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
//        final int result2 = MinimumSizeSubarraySum209
//                .minSubArrayLen(4, new int[]{1,4,4});
//        final int result3 = MinimumSizeSubarraySum209
//                .minSubArrayLen(4, new int[]{1,1,1,1,1,1,1,1});
        final int result4 = MinimumSizeSubarraySum209
                .minSubArrayLen(11, new int[]{1,2,3,4,5});
//        assertEquals(2, result);
//        assertEquals(1, result2);
//        assertEquals(0, result3);
        assertEquals(3, result4);



    }
}
