package com.etherofgodd;

import java.util.Arrays;

public class Main {

    public static  void main(String[] args) {

//        while loops

        int count = 0;

        while (count <= 20){
            System.out.println("Count "+ count);
            count++;
        }

//
//        do while
        do {
            System.out.println("Count from the do "+count);
            count++;
        } while (count <= 20);

    }

}
