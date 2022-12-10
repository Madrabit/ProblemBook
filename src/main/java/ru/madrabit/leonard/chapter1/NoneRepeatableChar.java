package ru.madrabit.leonard.chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Найти первый неповторяющийся символ.
 */
public class NoneRepeatableChar {

    public static String checkNoneRepeatableChar(String word) {
        final String[] splited = word.split("");
        String tmp = "";
        Map<String, Integer[]> map = new LinkedHashMap<>();
        int index = 0;
        for (String s : splited) {
            Integer[] inner = new Integer[2];
            inner[0] = ++index;
            inner[1] = map.getOrDefault(s, new Integer[]{index, 0})[1] + 1;
            map.put(s, inner);
        }
        for (Map.Entry<String, Integer[]> entry : map.entrySet()) {
            if (entry.getValue()[1] == 1) {
                return entry.getKey();
            }
        }

        return "";
    }
}
