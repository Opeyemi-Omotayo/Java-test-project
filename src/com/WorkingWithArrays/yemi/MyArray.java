package com.WorkingWithArrays.yemi;

import java.util.Arrays;

public class MyArray {

    int[] marks = {45, 56, 100};
    int[] marks2 = new int[5];
    double[] marks3 = new double[3];
    boolean[] marks4 = new boolean[3];

    void main() {
        for(int mark:marks){
            System.out.println(mark);
        }
        System.out.println(marks2.length);
        System.out.println(Arrays.toString(marks3));

    }
}
