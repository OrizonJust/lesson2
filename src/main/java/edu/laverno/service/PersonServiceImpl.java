package edu.laverno.service;

import edu.laverno.dao.PersonDAO;
import edu.laverno.domain.Person;

public class PersonServiceImpl implements PersonService {

    private final PersonDAO dao;

    public PersonServiceImpl(PersonDAO dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
