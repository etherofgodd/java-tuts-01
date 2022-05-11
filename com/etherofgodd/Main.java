package com.etherofgodd;

public class Main {

    public static  void main(String[] args) {
//  If statements

        int age  = 17;

        if(age >= 18){
            System.out.println("This is an adult.");
        }else if(age >=16 && age <= 18){
            System.out.println("I am almost and old man, pele...");
        } else {
            System.out.println("I am not yet an adult");
        }

//        ternary operators....


        String message =  age >= 18 ? "Old man": "KAI";
        System.out.println(message);


    }
}
