package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.model.Person;

import java.util.List;

public interface PersonService {
    public Person findPerson(int id);
    public Person savePerson(Person person);
    public String deletePerson(int id);
    public List<Person> findAllPersons();


}
