package ru.madrabit.leonard.chapter1;

import java.util.HashMap;
import java.util.Map;

/*
* подсчитать гласные и согласные буквы в слове
* */
public class CountVowels {
    private final Map<String, Integer> map = new HashMap<>();

    private final Map<String, String> vowelBook = Map.of("a", "a",
            "e","e",
            "u", "u",
            "o","o",
            "i", "i");
    public Map<String, Integer> counter(String str) {
        int vowels = 0;
        int consonants = 0;
        String[] split = str.split("");
        for (String s : split) {
            if (vowelBook.containsKey(s)) {
                vowels++;
            } else {
                consonants++;
            }
        }
        map.put("vowels", vowels);
        map.put("consonants", consonants);
        return  map;
    }
}
