package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import java.util.concurrent.*;

public class MultipleCallableRunner {

    static void main() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> callableTasks = List.of(new CallableTask("B"), new CallableTask("C"));


        List<Future<String>> results = executorService.invokeAll(callableTasks);

        for(Future<String> result: results){
            System.out.println(result.get());
        }


        executorService.shutdown();
    }
}
