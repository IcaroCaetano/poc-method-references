package com.project.poc_method_references.examples;


import com.project.poc_method_references.model.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example04UnboundInstanceMethod {

    public static void main(String[] args) {

        Person person = new Person("Joao", 30);

        // Lambda
        Function<Person, String> lambda = value -> value.getName();

        System.out.println("Lambda: " + lambda.apply(person));

        // Method Reference
        Function<Person, String> methodReference = Person::getName;

        System.out.println("Method Reference: " + methodReference.apply(person));
    }
}