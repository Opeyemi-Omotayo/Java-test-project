package com.WorkingWithArrays.yemi;

public class MyStudent {
    String name;
    int[] marks;


    public MyStudent(String name, int...  marks) {
        this.name = name;
        this.marks = marks;
    }

    static void main() {

    }

     int getNumberOfMarks() {
        return marks.length;
    }

     int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

     int getMaximumMarks() {
         int maximum = Integer.MIN_VALUE;
         for(int mark:marks){
             if(mark>maximum){
                 maximum = mark;
             }
         }
         return maximum;
    }

    int getMinimumMarks() {
        int minimum = Integer.MAX_VALUE;
        for(int mark:marks){
            if(mark<minimum){
                minimum = mark;
            }
        }
        return minimum;
    }
}
