package com.gorakhcodes.usermanagement.service;

import com.gorakhcodes.usermanagement.dao.PersonDao;
import com.gorakhcodes.usermanagement.exceptions.PersonNotFoundException;
import com.gorakhcodes.usermanagement.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person findPerson(int id) throws PersonNotFoundException {
        return personDao.findById(id).orElseThrow(() -> new PersonNotFoundException("Person Not Found for id: " + id));
    }


    @Override
    public Person savePerson(Person person) {
        return personDao.save(person);
    }

    @Override
    public Person deletePerson(int id) throws PersonNotFoundException {
        Person person = personDao.findById(id).orElseThrow(
                () -> new PersonNotFoundException("Person Not Found for id: " + id));
        if (person != null){
            personDao.delete(person);
        }
        return person;
    }

    @Override
    public Optional<List<Person>> findAllPersons() {
        return Optional.of(personDao.findAll());
    }
}
