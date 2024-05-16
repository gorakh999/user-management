package com.gorakhcodes.usermanagement.dao;

import com.gorakhcodes.usermanagement.model.Person;

public interface PersonDao {
    public Person getById(int id);
    public Person save(Person person);
    public Person[] getAllPersons();
}
