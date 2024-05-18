package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.dao.PersonDao;
import com.gorakhcodes.usermanagement.dao.PersonDaoImpl;
import com.gorakhcodes.usermanagement.model.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService{

    PersonDao personDao = new PersonDaoImpl();

    @Override
    public Person findPerson(int id) {
        return personDao.getById(id);
    }

    @Override
    public Person savePerson(Person person) {
        return personDao.save(person);
    }

    @Override
    public String deletePerson(int id) {
        return personDao.delete(id);
    }

    @Override
    public List<Person> findAllPersons() {
        return personDao.getAllPersons();
    }
}
