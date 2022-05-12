package com.etherofgodd;

import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {

//       A program that accepts a sccre as input and returns the grade as output.

        Scanner scoreInput = new Scanner(System.in);
        System.out.println("What was the score for this course?");

        int score = scoreInput.nextInt();

        if(score >= 70 && score <= 100){
            System.out.println("GRADE: A");
        }else if (score>=60 && score<=69){
            System.out.println("GRADE: B");
        }else if(score>=50 && score <=59){
            System.out.println("GRADE: C");
        }else if(score>=45 && score<= 49){
            System.out.println("GRADE: D");
        }else if(score>=0 && score<=44){
            System.out.println("GRADE: F");
        }else {
            System.out.println("Your Score is out of the grading system limit");
        }


    }



}
