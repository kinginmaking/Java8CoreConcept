package com.javabrains.stream_plus_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionInLambdaDemo
{

    static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                System.err.println(
                        "Arithmetic Exception occured : " + e.getMessage());
            }
        };
    }

    public void createSceneOne()
    {
        /*List<Integer> list_of_intergers =*/ Arrays.asList(4,5,6,23,78,9,10, 0).stream()

                .forEach( lambdaWrapper(i -> System.out.println(50 / i)));

    }

    public static void main(String[] args)
    {
            ExceptionInLambdaDemo demo_instance = new ExceptionInLambdaDemo();
            demo_instance.createSceneOne();
    }


}
