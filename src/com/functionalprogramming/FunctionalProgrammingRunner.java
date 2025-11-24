package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    static void main() {
        List<String> list = List.of("Apple", "Banana", "Pear", "Cherry", "Cat", "Lat");
        printWithFPWithFiltering(list);
    }

    private static void printBasic(List<String> list){
        for(String s : list){
            System.out.println(s);
        }
    }

    private static void printWithFP(List<String> list){
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }


}
