package com.amandazaine.service.impl;

import com.amandazaine.exceptions.ResourceNotFoundException;
import com.amandazaine.model.Person;
import com.amandazaine.repositories.PersonRepository;
import com.amandazaine.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {
    private Logger logger = Logger.getLogger(PersonServiceImpl.class.getName());

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findById(Long id) {
        logger.info("Finding one person!");
        return  personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person create(Person person) {
        logger.info("Creating a new person.");
        return personRepository.save(person);
    }

    @Override
    public Person update(Person personUpdate) {
        logger.info("Creating a new person.");
        Person person = personRepository.findById(personUpdate.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        person.setFirstName(personUpdate.getFirstName());
        person.setLastName(personUpdate.getLastName());
        person.setAddress(personUpdate.getAddress());
        person.setGender(personUpdate.getGender());

        return personRepository.save(person);
    }

    @Override
    public void delete(Long id) {
        logger.info("Deleting a person.");
        personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        personRepository.deleteById(id);
    }
}
