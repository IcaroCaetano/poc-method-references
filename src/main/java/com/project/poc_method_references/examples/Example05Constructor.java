package com.project.poc_method_references.examples;


import com.project.poc_method_references.model.Person;

import java.util.function.BiFunction;

public class Example05Constructor {

    public static void main(String[] args) {

        BiFunction<String, Integer, Person> lambda =
                (name, age) -> new Person(name, age);

        Person person1 = lambda.apply("Joao", 30);

        System.out.println("Lambda: " + person1);

        BiFunction<String, Integer, Person> constructorReference = Person::new;

        Person person2 = constructorReference.apply("Maria", 25);

        System.out.println("Constructor Reference: " + person2);
    }
}