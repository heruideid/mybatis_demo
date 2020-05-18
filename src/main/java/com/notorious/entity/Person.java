package com.notorious.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Person {
    int id;
    String name;

    public Person(String name,int i) {
        id=i;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }
}
