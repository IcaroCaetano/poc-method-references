package com.project.poc_method_references.examples;

import java.util.function.Consumer;

public class Example01LambdaToMethodReference {

    public static void main(String[] args) {

        Consumer<String> lambda = value -> System.out.println(value);

        lambda.accept("Hello Lambda");

        Consumer<String> methodReference = System.out::println;

        methodReference.accept("Hello Method Reference");
    }
}