import java.util.Calendar;
import java.util.Date;

public class DateExercise {

    static void main() {
        System.out.println(isWeekDay(4));
        System.out.println(determineNameOfMonth(6));

    }

    static boolean isWeekDay(int dayNumber) {
        return dayNumber != 0 && dayNumber != 6;
    };

    static String determineNameOfMonth(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> null;
        };
    }

    static boolean isLeapYear(int year) {
       return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);


    }
}
