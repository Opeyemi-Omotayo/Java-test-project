package com.WorkingWithArrays.yemi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyStudentRunner {
    static void main() {
        int[] marks = {22,45, 56,67};


        MyStudent student = new MyStudent("Opeyemi", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Length of marks is " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks is " + sum);

        int minimum = student.getMinimumMarks();
        System.out.println("Minimum of marks is " + minimum);

        int maximum = student.getMaximumMarks();
        System.out.println("Maximum of marks is " + maximum);
    }
}
