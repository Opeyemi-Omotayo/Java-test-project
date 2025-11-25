package com.functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    static void main() {
        List<Integer> numbers = List.of(13, 5, 3, 5, 54, 72, 233, 54, 5);

        //printNumbers();
        //printSquareOfNumbers();
        maximumNumbers(numbers);
        minimumNumbers(numbers);
        System.out.println(oddNumbers(numbers));
        //System.out.println(sumOfNumbers(numbers));
        //sortedNumbers(numbers);
        //distinctNumbers(numbers);
    }


    static int sumOfNumbers(List<Integer> numbers) {
      return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    static void sortedNumbers(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);

        //numbers.stream().sorted((Integer a, Integer b) -> a > b ? 0 : -1).forEach(System.out::println);
    }

    static void distinctNumbers(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    static void printNumbers(){
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }

    static void printSquareOfNumbers(){
        IntStream.rangeClosed(1, 10).map(e -> e * e).forEach(System.out::println);
    }

    static void maximumNumbers(List<Integer> numbers) {
        numbers.stream().max(Integer::compare).ifPresent(System.out::println);
    }

    static void minimumNumbers(List<Integer> numbers) {
        numbers.stream().min(Integer::compare).ifPresent(System.out::println);
    }

    static List<Integer> oddNumbers(List<Integer> numbers) {
       return numbers.stream().filter(e -> e % 2 == 1).toList();
    }


}
