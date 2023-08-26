package com.filiptasic;

import com.filiptasic.declerative.DeclarativeService;
import com.filiptasic.entity.Person;
import com.filiptasic.imperative.ImperativeService;

import java.util.List;

import static com.filiptasic.entity.Gender.FEMALE;
import static com.filiptasic.entity.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Keisha", FEMALE),
            new Person("Becky", FEMALE),
            new Person("Philip", MALE),
            new Person("Alice", FEMALE)
        );

        System.out.println(ImperativeService.getFemales(people));
        System.out.println(DeclarativeService.getFemales(people));
    }
}