package com.notorious.repository;

import com.notorious.entity.Person;

import java.util.List;

public interface PersonRepository {
    public int save(Person person);
    public int deleteById(int id);
    public int update(Person person);
    public Person findById(int id);
    public List<Person> findAll();
}
