package ru.madrabit.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesinanArray442 {

    // [4,3,2,7,8,2,3,1]
    public static List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            Integer number = nums[i];
            if (map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, 2);
                count++;
            }
        }


        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }



        return result;
    };

    public static void main(String[] args) {
        findDuplicates(new int[] {4, 4,3,2,7,8,2,3,1});
    }
}
