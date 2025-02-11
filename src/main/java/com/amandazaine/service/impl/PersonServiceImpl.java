package com.amandazaine.service.impl;

import com.amandazaine.model.Person;
import com.amandazaine.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {

    private final AtomicLong atomicLong = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServiceImpl.class.getName());


    @Override
    public Person findById(String id) {
        logger.info("Finding one person!");
        return new Person();
    }
}
