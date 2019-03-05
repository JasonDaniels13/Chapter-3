package com.jasond.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person1 = new Person("Jason",18);
    Person person2 = new Person("David", 21);
    Person person3 = new Person("Jason",18);

//    @Test
//    public void equals() {
//
//        Person person1 = new Person("Jason",18);
//        Person person2 = new Person("David", 21);
//        Person person3 = new Person("Jason",18);
//
//        System.out.println("Testing Object person1 and person2 equality, ie Are the variables the same? ");
//        System.out.println(person1.equals(person2));
//        System.out.println("Testing Object person1 and person3 equality, ie Are the variables the same? ");
//        System.out.println(person1.equals(person3));
//
//        System.out.println("\n"+ "Testing Object person1 and person2 Identity, ie Are the memory locations the same? ");
//        System.out.println(person1 == person2);
//       //assigning person3 to person1 object
//        person1 = person3;
//        System.out.println("\n"+ "Testing Object person1 and person3 after assiging person3 to object person1. ie Are the memory locations the same?" );
//        System.out.println(person1 == person3);
//
//
//    }
    @Test
    public void GivenTheObjectSharesMemoryLocation_TrueIsReturned() {


        System.out.println("\n"+ "Testing Object person1 against person2 Identity: ");
        System.out.println( person1 == person2);
        System.out.println("\n"+ "Testing Object person1 against person3 Identity: ");
        System.out.println( person1 == person3);
        System.out.println("\n"+ "Testing Object person2 against person3 Identity: ");
        System.out.println( person2 == person3);

        //assigning person3 to person1 object
        person1 = person3;
        System.out.println("\n"+ "Testing Object person1 against person3 after assiging person3 to object person1." );
        System.out.println(person1 == person3);

    }

    @Test
    public void GivenTheObjectsHaveEquality_TrueIsReturned() {

        Person person1 = new Person("Jason",18);
        Person person2 = new Person("David", 21);
        Person person3 = new Person("Jason",18);

        System.out.println("\n"+ "Testing Object person1 and person2 Equality: ");
        System.out.println( person1.equals(person2));
        System.out.println("\n"+ "Testing Object person1 and person3 Equality: ");
        System.out.println( person1.equals(person3));
        System.out.println("\n"+ "Testing Object person2 and person3 Equality: ");
        System.out.println( person2.equals(person3));
    }


}