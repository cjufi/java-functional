package com.filiptasic.imperative;

import com.filiptasic.entity.Person;

import java.util.ArrayList;
import java.util.List;

import static com.filiptasic.entity.Gender.FEMALE;

public class ImperativeService {

    public static List<Person> getFemales(List<Person> people) {
        List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if(person.getGender().equals(FEMALE)) {
                females.add(person);
            }
        }
        return females;
    }

}
