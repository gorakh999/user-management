package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.exceptions.PersonNotFoundException;
import com.gorakhcodes.usermanagement.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    public Person findPerson(int id) throws PersonNotFoundException;
    public Person savePerson(Person person);
    public Person deletePerson(int id) throws PersonNotFoundException;
    public Optional<List<Person>> findAllPersons();


}
