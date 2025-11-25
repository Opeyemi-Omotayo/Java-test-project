package com.exceptionhandling;

public class ExceptionHandlingRunner {

    static void main() {
       method1();
    }

    static void method1() {
        try {
            String str = null;
            str.length();
        }catch (Exception e) {
            System.err.println("Exception caught");
            e.printStackTrace();
        } finally{
            System.out.println("finally");
        }
    }
}
