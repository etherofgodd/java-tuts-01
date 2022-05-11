package com.etherofgodd;

public class Main {

    public static  void main(String[] args) {
//      comparison operators ---  most are referred to as boolean expressions.
        int khalidAge = 18;
        int mariamAge = 20;

        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
        boolean isKhalidYoungerThanMariam = khalidAge < mariamAge;
        boolean isKhalidSameAgeWithMariam = khalidAge == mariamAge;
//        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;

        System.out.println("isKhalidOlderThanMariam" + isKhalidOlderThanMariam);
        System.out.println("isKhalidYoungerThanMariam "+isKhalidYoungerThanMariam);
        System.out.println("isKhalidSameAgeWithMariam" + isKhalidSameAgeWithMariam);

        System.out.println(khalidAge>= mariamAge);
        System.out.println(khalidAge<= mariamAge);
        System.out.println(khalidAge!= mariamAge);

    }
}
