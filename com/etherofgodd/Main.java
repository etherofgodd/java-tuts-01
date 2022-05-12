package com.etherofgodd;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static  void main(String[] args) {

//        classes and objects

        Lens lensOne = new Lens("Panasonic", "85mm", false);
        Lens lensTwo = new Lens("Sony", "95mm", true);
        Lens lensThree = new Lens("Cannon", "103mm", true);

        System.out.println(lensOne.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensThree.isPrime);
    }

    public static  class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

        Passport ukPassport = new Passport(
                "012",
                LocalDate.of(2024,12,29));

        Passport usPassport = new Passport(
                "013",
                LocalDate.of(2025,3,21));
    }

    static  class Passport {
        String number;
        LocalDate expiryDate;

        Passport(String number, LocalDate expiryDate){
            this.number = number;
            this.expiryDate = expiryDate;
        }


    }

}
