package com.spring.service;

import com.spring.dao.PersonDao;
import com.spring.domain.Person;

public class PersonServiceImpl implements PersonService {

    private PersonDao dao;


    public void setDao(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
