package com.project.poc_method_references.examples;


import java.util.function.Function;

public class Example02StaticMethod {

    public static void main(String[] args) {

        
        Function<String, Integer> lambda =
                value -> Integer.parseInt(value);

        System.out.println(lambda.apply("100"));

        
        Function<String, Integer> methodReference =
                Integer::parseInt;

        System.out.println(methodReference.apply("200"));
    }
}