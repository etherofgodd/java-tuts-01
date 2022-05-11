package com.etherofgodd;

import java.util.Arrays;

public class Main {

    public static  void main(String[] args) {
//    Arrays

//        one way of creating and initializing an array;
        int [] numbers = {2,3,4,5,6,7};
        String [] names = {"ALI", "MARIA"};

//        another way of doing the same;
//        int [] numbers = new int[4];
//        numbers[0] = 2;
//        numbers[1]=4;
//        numbers[2]=90;
//        numbers[3]=33;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(names.length);


//        Arrays and indexes....
//        [0,1,2,3,4,5,6,7,8,9,10,11,...]
    }
}
