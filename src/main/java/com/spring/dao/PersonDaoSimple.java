package com.spring.dao;

import com.spring.domain.Person;

public class PersonDaoSimple implements PersonDao {

    private int defaultAge;

    public Person findByName(String name) {
        return new Person(name, defaultAge);
    }

    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }
}
