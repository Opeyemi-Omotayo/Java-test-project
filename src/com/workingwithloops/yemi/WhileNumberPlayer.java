package com.workingwithloops.yemi;

public class WhileNumberPlayer {
  //working with while loop
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer();
        player.printSquaresUpToLimit(12);
        player.printSquaresUpToLimit(30);
    }

     void printSquaresUpToLimit(int limit) {
        int i = 1;
        while (i * i <= limit) {
            System.out.println(i * i);
            i++;
        }
    }
}
