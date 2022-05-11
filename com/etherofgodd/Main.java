package com.etherofgodd;

import java.util.Arrays;

public class Main {

    public static  void main(String[] args) {

        int[] numbers = {2,0,1,4,100,4,90,78,77};
//
//        for(int i = 0; i< numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//


//        Reverse order
//        for(int i = numbers.length -1; i >= 0; i--){
//            System.out.println(numbers[i]);
//        }

        //    enhanced arrays
        for(int number: numbers){
//            System.out.println(number);
        }

//        numbers.forI
//        for (int i = numbers.length - 1; i >= 0; i--) {
//
//        }

        Arrays.stream(numbers).forEach(System.out::println);
    }



}
