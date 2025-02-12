package com.amandazaine.service;

import com.amandazaine.model.Person;

import java.util.List;

public interface PersonService {
    Person findById(Long id);
    List<Person> findAll();
    Person create(Person person);
    Person update(Person person);
    void delete(Long id);
}
