package com.javabrains.multithreading_concepts;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        Runnable task1 = () -> {

            for(int i = 1;i<=20;i++)
            {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        Runnable task2 = () -> {

            for(int i = 1;i<=20;i++)
            {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        Runnable task3 = () -> {

            for(int i = 1;i<=20;i++)
            {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task3");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        Runnable task4 = () -> {

            for(int i = 1;i<=20;i++)
            {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task4");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

        List<Runnable> list_of_runnable = new LinkedList<>();
        list_of_runnable.add(task1); list_of_runnable.add(task2); list_of_runnable.add(task3); list_of_runnable.add(task4);

        ExecutorService executorService = Executors.newFixedThreadPool(20);
      /*  executorService.invokeAll(Collections.unmodifiableList(list_of_runnable));
      *
      *   invokeAll does not work with bunch of Runnables
      *   solution on stackoverflow is to convert Runnable to Callable
      *
      * '
      * https://www.baeldung.com/java-executor-service-tutorial
      *
      * */


    }


}
