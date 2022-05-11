package com.etherofgodd;

public class Main {

    public static  void main(String[] args) {
    //  Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = ten + two;
        int subtraction = ten - two;
        int multipication = ten * two;
        int division = ten / two;
        int modulo = ten % two;

        System.out.println(addition);
        System.out.println("sub "+subtraction);
        System.out.println(multipication);
        System.out.println(division);
        System.out.println(modulo);



//      Using the math class.

        int math = Math.abs(-10);
        double biggerNum = Math.max(10.2,2.3);
        double smallerNum = Math.min(10.2,2.3);
        double raiseTopow = Math.pow(3,3);

//      casting
        int squareRoot = (int) Math.sqrt(25);

        System.out.println("from "+math);
        System.out.println(biggerNum);
        System.out.println(smallerNum);
        System.out.println(raiseTopow);
        System.out.println(squareRoot);



    }
}
