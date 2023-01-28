package ru.madrabit.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNumberOfEventsThatCanBeAttended1353 {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingDouble(o -> o[0]));
        int count = 1;
        for (int i = 1; i < events.length; i++) {
            if (events[i][0] == events[i - 1][0]) {
            }
        }
        return 5;


    }
}
