package com.gorakhcodes.usermanagement.utils;

import com.gorakhcodes.usermanagement.model.Person;

public class PersonUtils {
    Person [] persons = new Person[5];
    public static int personCount = 0;

    public PersonUtils(){
        persons[0] = new Person(1, "Abc", 24);
        personCount++;
        persons[1] = new Person(2, "xyz", 13);
        personCount++;
    }
    public Person[] getAllPerson(){
        return persons;
    }
    public Person save(Person person){
        if (personCount < persons.length){
            persons[personCount] = person;
            personCount++;
        }
        else{
            Person [] newPersons = new Person[persons.length * 2];
            int newPersonCount = 0;
            while(newPersonCount < personCount){
                newPersons[newPersonCount] = persons[newPersonCount];
                newPersonCount++;
            }
            persons = newPersons;
            personCount = newPersonCount;
            persons[personCount] = person;
            personCount++;
        }

        return person;
    }
}
