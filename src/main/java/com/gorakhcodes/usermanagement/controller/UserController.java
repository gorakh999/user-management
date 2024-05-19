package com.gorakhcodes.usermanagement.controller;

import com.gorakhcodes.usermanagement.exceptions.PersonNotFoundException;
import com.gorakhcodes.usermanagement.model.Person;
import com.gorakhcodes.usermanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public static String hello(){
        return "Hello User";
    }

    @GetMapping("/")
    public static String home(){
        return "<h1> Welcome to User Management Service </h1>";
    }
    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable int id) throws PersonNotFoundException {
        return personService.findPerson(id);
    }
    @GetMapping("/persons")
    public Optional<List<Person>> getAllPersons(){
        return personService.findAllPersons();
    }

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @PutMapping("/persons")
    public Person updatePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @DeleteMapping("/persons/{id}")
    public Person deletePerson(@PathVariable int id) throws PersonNotFoundException{
        return personService.deletePerson(id);
    }

}
