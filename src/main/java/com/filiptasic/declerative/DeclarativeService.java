package com.filiptasic.declerative;

import com.filiptasic.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

import static com.filiptasic.entity.Gender.FEMALE;

public class DeclarativeService {

    public static List<Person> getFemales(List<Person> people) {

        return people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .collect(Collectors.toList());
    }
}
