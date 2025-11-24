package com.WorkingWithArrays.yemi;

public class DaysOfTheWeek {

    static void main() {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        String daysWithMostCharacters = "";
        for(String day:daysOfTheWeek){
            if(day.length() > daysWithMostCharacters.length()){
                daysWithMostCharacters = day;
            }
        }

        System.out.println(daysWithMostCharacters);

    }
}
