package com.notorious.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Classes{
    int id;
    String name;
    List<Student> students;
}
