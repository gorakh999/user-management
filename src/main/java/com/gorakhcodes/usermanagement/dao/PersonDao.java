package com.gorakhcodes.usermanagement.dao;

import com.gorakhcodes.usermanagement.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonDao extends MongoRepository<Person, Integer> {

}
