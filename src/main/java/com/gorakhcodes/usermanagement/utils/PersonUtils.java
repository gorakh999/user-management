package com.gorakhcodes.usermanagement.utils;

import com.gorakhcodes.usermanagement.model.Person;

public class PersonUtils {
    Person [] persons = new Person[5];
    int personCount = 0;

    public PersonUtils(){
        persons[0] = new Person(1, "Abc", 24);
        personCount++;
        persons[1] = new Person(2, "xyz", 13);
        personCount++;
    }
}
