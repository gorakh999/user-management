package com.gorakhcodes.usermanagement.model;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private int age;
//    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
//        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
//                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
