package com.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    static void main() {
        try(Scanner sc = new Scanner(System.in)) {
           int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
           int number = numbers[21];
        }
    }
}
