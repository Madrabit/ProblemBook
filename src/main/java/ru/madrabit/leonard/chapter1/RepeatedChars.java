package ru.madrabit.leonard.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepeatedChars {

    public static int countChars(String word) {
        final String[] splited = word.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : splited) {
            if (map.get(s) == null) {
                map.put(s, 0);
            } else {
                map.compute(s, (k, v) -> v == 0 ? 2 : v + 1 );
            }
        }
        return map.values().stream().mapToInt(value -> value).sum();
    }

    public static long countChars2(String word) {
        final IntStream chars = word.chars();
        final Stream<Character> characterStream = chars.mapToObj(c -> (char) c);
        final Map<Character, Long> collected = characterStream.collect(Collectors.groupingBy(character -> character, Collectors.counting()));
        return collected.values().stream().mapToLong(value -> value).filter(value -> value > 1).sum();
    }
}
