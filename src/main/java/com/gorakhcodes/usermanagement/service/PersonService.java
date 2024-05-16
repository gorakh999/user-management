package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.model.Person;

public interface PersonService {
    public Person findPerson(int id);
    public Person savePerson(Person person);
    public Person[] findAllPersons();


}
