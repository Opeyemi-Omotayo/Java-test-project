package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    static void main() {
        Set<String> set = Set.of("a", "b", "c", "d", "e", "f");
        Set<String> hashSet = new HashSet<>(set);
        hashSet.add("g");
        hashSet.add("h");
        hashSet.add("i");// not store in the order in which they are added
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(344);
        numbers.add(31); //stored in the order in which they are added

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(344);
        numbers2.add(1);
        numbers2.add(45);
        numbers2.add(31);// are sorted




        System.out.println(set.size());
        System.out.println(hashSet.size());
        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbers2.floor(31));
        System.out.println(numbers2.lower(31));
        System.out.println(numbers2.ceiling(31));
        System.out.println(numbers2.higher(31));
        System.out.println(numbers2.subSet(31, 35));
    }
}
