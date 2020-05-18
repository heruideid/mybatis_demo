package com.notorious.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student{
    int id;
    String name;
    Classes aClass;

    public int getId() {
        return id;
    }

    public Classes getaClass(){
        return aClass;
    }

//    public Student(int id,String name,Classes newClass){
//        this.id=id;
//        this.name=name;
//        this.aClass=newClass;
//    }
}
