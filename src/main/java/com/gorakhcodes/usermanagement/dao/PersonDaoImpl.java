package com.gorakhcodes.usermanagement.dao;

import com.gorakhcodes.usermanagement.model.Person;
import com.gorakhcodes.usermanagement.utils.PersonUtils;

import java.util.List;


public class PersonDaoImpl implements  PersonDao{
    PersonUtils personUtils=  new PersonUtils();
    @Override
    public Person getById(int id) {
        List<Person> persons = personUtils.getAllPerson();
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person save(Person person) {
        return personUtils.save(person);
    }

    @Override
    public String delete(int id) {
        return personUtils.delete(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personUtils.getAllPerson();
    }
}
