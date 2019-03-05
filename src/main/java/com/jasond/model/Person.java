package com.jasond.model;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public boolean equals(Person p){
        return (p.name == name) && (p.age == age);

    }
}
