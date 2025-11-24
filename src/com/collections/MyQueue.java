package com.collections;

import java.util.*;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class MyQueue {

    static void main() {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

        queue.offer("Monkey");

        queue.addAll(List.of("Apple", "Goat", "Pineapple", "Dog"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
