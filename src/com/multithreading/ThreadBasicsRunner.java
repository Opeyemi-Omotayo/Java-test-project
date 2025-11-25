package com.multithreading;

class Task1 extends Thread {
    public void run() {
        System.out.print("Task 1 started");

        for(int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.print("Task 1 done");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.print("Task 2 started");

        for(int i = 101; i <= 200; i++) {
            System.out.print(i + " ");
        }

        System.out.print("Task 2 done");
    }
}

public class ThreadBasicsRunner {
    static void main() throws InterruptedException {
        //task1
        Task1 t1 = new Task1();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        //task2
       Task2 t2 = new Task2();
       Thread t2Thread = new Thread(t2);
       t2Thread.start();

       //wait for task1 to complete before executing task3
        t1.join();
        //task3
        for(int i = 201; i < 300; i++) {
            System.out.print(i + " ");
        }

        System.out.print("Task 3 done");
    }
}
