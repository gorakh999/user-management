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
        persons[2] = new Person(3, "pqr", 22);
        personCount++;
    }
    public Person[] getAllPerson(){
        return persons;
    }
    public Person save(Person person){
        int personExist = isExist(person);
        if (personExist != -1){
            persons[personExist] = person;
            return person;
        }
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
    public int isExist(Person person){
        for(int i = 0; i < personCount; i++){
            if (persons[i].getId() == person.getId()){
                return i;
            }
        }
        return -1;
    }
}
