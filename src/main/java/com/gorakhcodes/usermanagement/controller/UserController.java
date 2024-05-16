package com.gorakhcodes.usermanagement.controller;

import com.gorakhcodes.usermanagement.model.Person;
import com.gorakhcodes.usermanagement.service.PersonService;
import com.gorakhcodes.usermanagement.service.PersonServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    PersonService personService = new PersonServiceImpl();

    @GetMapping("/hello")
    public static String hello(){
        return "Hello User";
    }
    @GetMapping("/")
    public static String home(){
        return "<h1> Welcome to User Management Service </h1>";
    }
    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable int id){
        return personService.findPerson(id);
    }
    @GetMapping("/persons")
    public Person[] getAllPersons(){
        return personService.findAllPersons();
    }

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

}
