package com.gorakhcodes.usermanagement.utils;

import com.gorakhcodes.usermanagement.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonUtils {
    List<Person> persons = new ArrayList<Person>();

    public PersonUtils() {
        persons.add(new Person(1, "Abc", 24));
        persons.add(new Person(2, "xyz", 13));
        persons.add(new Person(3, "pqr", 22));
    }

    public List<Person> getAllPerson() {
        return persons;
    }

    public Person save(Person person) {
        int personExist = isExist(person.getId());
        if (personExist != -1){
            persons.remove(personExist);
            persons.add(personExist, person);
            return person;
        }
        persons.add(person);
        return person;

    }

    public int isExist(int id) {
        for(int i = 0; i < persons.size(); i++){
            if (persons.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public String delete(int id) {
        int index = isExist(id);
        if (index != -1) {
            persons.remove(index);
            return "Person Deleted Successfully.";
        }
        return "Person Not Found.";
    }
}
