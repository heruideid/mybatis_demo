package com.notorious.repository;

import com.notorious.entity.Person;
import com.notorious.entity.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentRepository {
    public Student findById(int id);
    public Student findByIdLazy(int id);
    public Student findByStudent(Student student);
}
