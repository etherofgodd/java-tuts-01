package com.etherofgodd;

import java.util.Arrays;

public class Main {

    public static  void main(String[] args) {

//    Methods

//        Built in methods
        System.out.println("Hurray");
        String brand = "Samsung";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));

//        custom methods

        char[] letters = {'A', 'B', 'C','D','D','E','7'};

        System.out.println(countOccurrences(letters, 'D'));

    }

    public static  int countOccurrences(char[] letters,  char searchLetter){
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);

        int count = 0;
        for (char letter: letters){
            if(letter == searchLetter){
                count++;
            }
        }
        return  count;
    }

}
