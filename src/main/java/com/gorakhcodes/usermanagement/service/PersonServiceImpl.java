package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.dao.PersonDao;
import com.gorakhcodes.usermanagement.dao.PersonDaoImpl;
import com.gorakhcodes.usermanagement.model.Person;

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
    public Person[] findAllPersons() {
        return personDao.getAllPersons();
    }
}
