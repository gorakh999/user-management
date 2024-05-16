package com.gorakhcodes.usermanagement.dao;

import com.gorakhcodes.usermanagement.model.Person;
import com.gorakhcodes.usermanagement.utils.PersonUtils;


public class PersonDaoImpl implements  PersonDao{
    PersonUtils personUtils=  new PersonUtils();
    @Override
    public Person getById(int id) {
        int arraySize = PersonUtils.personCount;
        Person [] persons = personUtils.getAllPerson();
        for(int i = 0; i < arraySize; i++){
            if (persons[i].getId() == id){
                return persons[i];
            }
        }
        return null;
    }

    @Override
    public Person save(Person person) {
        return personUtils.save(person);
    }

    @Override
    public Person[] getAllPersons() {
        Person [] result = personUtils.getAllPerson();
        Person [] persons = new Person[PersonUtils.personCount];
        for(int i = 0; i < PersonUtils.personCount; i++){
            persons[i] = result[i];
        }
        return persons;
    }
}
