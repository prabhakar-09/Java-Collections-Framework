package com.collections.framework.z_practice;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates the problem of unsynchronized access to ArrayList
 * when multiple threads try to modify it concurrently.
 */
public class SyncAccessOfArrLists {

    public static void main(String[] args) throws InterruptedException {
        // Create an ArrayList
        List<Integer> intArr = new ArrayList<>();

        // Add items to the array
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);

        // Create a thread pool of size 100
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        // Create a Runnable task that increments each element of the ArrayList by one
        Runnable task = () -> {
            incrementArray(intArr);
        };

        // Submitting the task to the executor service 100 times.
        // All the tasks will modify the elements concurrently
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Arr " + intArr);
    }

    /**
     * This method increments each element of the given ArrayList by one.
     *
     * @param arrList The ArrayList to be modified
     */
    public static void incrementArray(List<Integer> arrList) {
        // Display the size of the array
        System.out.println("Array Size " + arrList.size());

        // Iterate through the array and increment each element by one
        for (int i = 0; i < arrList.size(); i++) {
            Integer value = arrList.get(i);
            // Update the element at index i with the incremented value
            arrList.set(i, value + 1);
        }
    }
}

//OUT :Final Arr [101, 102, 103, 103, 105] every time we run this we get different result due to concurrency & unsafe thread handling..
