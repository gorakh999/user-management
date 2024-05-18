package com.gorakhcodes.usermanagement.dao;

import com.gorakhcodes.usermanagement.model.Person;

import java.util.List;

public interface PersonDao {
    public Person getById(int id);
    public Person save(Person person);
    public String delete(int id);
    public List<Person> getAllPersons();
}
