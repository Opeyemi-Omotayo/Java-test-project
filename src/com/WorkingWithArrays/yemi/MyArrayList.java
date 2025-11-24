package com.WorkingWithArrays.yemi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyArrayList {
    ArrayList<Integer> marks = new ArrayList<Integer>();
    //you can also use Collections.sort() to sort arraylist

    void main() {
        marks.add(1);
        marks.add(2);

        System.out.println(Arrays.toString(marks.toArray()));
        System.out.println(getMaximumMark());
        System.out.println(getMinimumMark());

    }

    int getMaximumMark() {
       return Collections.max(marks);
    }

    int getMinimumMark() {
        return Collections.min(marks);
    }
}
