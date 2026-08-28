package com.project.poc_method_references.examples;

import com.project.poc_method_references.model.Person;

import java.util.function.Supplier;

public class Example03BoundInstanceMethod {

    public static void main(String[] args) {

        Person person = new Person("Joao", 30);

        Supplier<String> lambda = () -> person.getName();

        System.out.println("Lambda: " + lambda.get());

        Supplier<String> methodReference = person::getName;

        System.out.println("Method Reference: " + methodReference.get());
    }
}