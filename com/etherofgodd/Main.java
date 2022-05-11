package com.etherofgodd;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static  void main(String[] args) {

    //  Difference between static and reference types
        int a = 10;
        int b = a;

        a = 100;

        System.out.println("a =  "+ a + " - b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;
        alex.name = "KUNBI";

       System.out.println(alex.name);
       System.out.println(mariam.name);


    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }

//  use camel case for naming variables.
}
