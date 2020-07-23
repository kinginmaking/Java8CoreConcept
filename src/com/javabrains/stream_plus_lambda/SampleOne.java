package com.javabrains.stream_plus_lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleOne {

    public static void main(String[] args) {
        IntStream abc = IntStream.range(1,51);

        double val = Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .getAsDouble();
        System.out.println("Value:"+val);
    }


}