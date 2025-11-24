package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    static void main() {
        List<String> words =List.of("Hello","World");

        List<String> wordsArrayList = new ArrayList<String>(words);

        for(String word : wordsArrayList){
            if(word.endsWith("d")){
                System.out.println(word);
            }
        }
    }
}
