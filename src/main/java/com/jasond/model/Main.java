package com.jasond.model;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jason",18);
        Person person2 = new Person("Jason",18);

       // checks the state. is the name and age the same (checks the attributes
        //object equality.


        //check the memory location the same , checks if the type is the same
        // this is the object identity
        System.out.println(person1 == person2);

    }
}
