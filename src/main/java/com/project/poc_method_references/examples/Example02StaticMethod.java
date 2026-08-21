package com.project.java8.methodreference.examples;

import java.util.function.Function;

public class Example02StaticMethod {

    public static void main(String[] args) {

        // Lambda
        Function<String, Integer> lambda =
                value -> Integer.parseInt(value);

        System.out.println(lambda.apply("100"));

        // Method Reference
        Function<String, Integer> methodReference =
                Integer::parseInt;

        System.out.println(methodReference.apply("200"));
    }
}