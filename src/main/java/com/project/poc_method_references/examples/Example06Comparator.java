package com.project.poc_method_references.examples;


import com.project.poc_method_references.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example06Comparator {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Maria", 34));
        people.add(new Person("João", 21));
        people.add(new Person("Carlos", 42));
        people.add(new Person("Ana", 27));

        System.out.println("=== Original ===");
        people.forEach(System.out::println);

        people.sort(
                Comparator.comparing(
                        person -> person.getName()
                )
        );

        System.out.println("\n=== Lambda ===");
        people.forEach(System.out::println);

        people.sort(
                Comparator.comparing(
                        Person::getName
                )
        );

        System.out.println("\n=== Method Reference ===");
        people.forEach(System.out::println);
    }
}