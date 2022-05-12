package com.etherofgodd;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {

//      Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");

        String userName = scanner.nextLine();


        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("Your name is "+ userName);
        System.out.println("You are "+ age+ " years of age");
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

    }

}
