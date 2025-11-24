package com.workingwithloops.yemi;

public class MyNumber {
//for loop
     void main() {
        System.out.println(isPrimeNumber(7));
         System.out.println(isPrimeNumber(8));
         System.out.println(isPrimeNumber(2));
         System.out.println(sumUpToN(6));
         System.out.println(sumUpToN(3));
         System.out.println(sumOfDivisors(6));
         System.out.println(printNumberTriangle(8));
         System.out.println(printNumberTriangle(9));

     }

    boolean isPrimeNumber(int number) {
         if(number == 2) return true;

        for (int i = 2; i < number; i++) {
            return number % i != 0;
        }
        return false;
    }

    int sumUpToN(int number) {
         //1+2+3+ ....+number
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    int printNumberTriangle(int number) {
         for (int i = 2; i < number; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j + " ");
             }
             System.out.println();
         }
         return 0;
    }
}
