package com.javabrains.optionalDemo;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class SampleOne {

    public static  void trial1()
    {
        Optional<String> myMessage = Optional.of("Lord of Ring");
        System.out.println(myMessage.isPresent());
        System.out.println("Extracted Message 1 : "+myMessage.get());

        Optional<Integer> myMessage1 = Optional.ofNullable(null);

        System.out.println("status of myMessage1 :"+myMessage1.isPresent());

    }

    public static void trial2() {

        String receiveName = null;

        String name = Optional.ofNullable(receiveName).orElse("Ashish");



    }


    public static void main(String[] args) {

          trial1();
       // trial2();


    }
}
