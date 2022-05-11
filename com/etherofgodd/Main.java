package com.etherofgodd;

import java.util.Date;

public class Main {

    public static  void main(String[] args){
    //  primitive data type; int long double
        byte theByte = -123;
        short theShort = 3933;
        int theInt = 100;
        long theLong = 3131301301301301313L;
//        above 4 allows to store whole numbers;

//        Below for decimals
        float theFloat = 2.12F;
        double doublePi = 3.142;

        boolean isBroke = true;

//        characters

        char nameInitials = 'E';

        System.out.println(nameInitials);;
        System.out.println(theByte);;
        System.out.println(theFloat);;
        System.out.println(isBroke);;
        System.out.println(doublePi);;
        String alias = "ether of godd";

        Date date = new Date();
        System.out.println(date);

//        underscores to visualize numbers
        int amountOf = 3_000_000;
        System.out.println(amountOf);


    }
}
