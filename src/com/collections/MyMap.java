package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    static void main() {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3, "D", 4);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Z", 23);
        System.out.println(map.get("A"));
        System.out.println(map.size());
        System.out.println(map.containsKey("A"));
        System.out.println(map);


        String str = "This is a string";

        Map<Character, Integer> occurances = new HashMap<>();

        char[] charArray = str.toCharArray();

        System.out.println(charArray.length);

        for (char c : charArray) {
            occurances.put(c, occurances.getOrDefault(c, 0) + 1);
        }

        System.out.println(occurances);
    }
}
