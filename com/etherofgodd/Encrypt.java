package com.etherofgodd;

import java.util.Scanner;

public class Encrypt {

    public static  void main(String[] args) {

//      ENCRYPT data


//        I used this to collect the data input
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Data to be encrypted:");

        String data = dataInput.nextLine();

//        Initialized Substrings A and B as specified
        String A = "";
        String B = "";

//        Get the lent of the data input
        int dividedByTwo = data.length() / 2;


        if (data.length() < 3) {
//            Here i checked to see if the length of the data entered is above 3, if it's not i threw an error :(
            System.out.println("Data does not exceed the required limit");
        } else {
//            If it is, i proceed :)
            if (data.length() % 2 == 1){
//                if its an odd number, i add one to the end of the  half, making it even. then i use the substring method to return the
//                sub string from index 0, to exact half + 1 index
                A = data.substring(0, dividedByTwo + 1);

//                Used the StringBuilder class to create a copy of A
                StringBuilder sb1 = new StringBuilder(A);

//                reversed the string as specified
                sb1.reverse();

//                assigned the reversed string
                A = sb1.toString();

//                  I Assigned B the rest of the string from the exact half + 1 index to the end
                B = data.substring(dividedByTwo + 1);

                //Used the StringBuilder class to create a copy of B
                StringBuilder sb2 = new StringBuilder(B);

//                Reversed string as specified
                sb2.reverse();

//                assigned the reversed string;
                B = sb2.toString();



            } else {
//                If it's even i repeated the same process.
//                But +1 wont be added to the half because it's already an even number;


                    A = data.substring(0, dividedByTwo);
                    StringBuilder sb1 = new StringBuilder(A);
                    sb1.reverse();
                    A = sb1.toString();


                    B = data.substring(dividedByTwo);
                    StringBuilder sb2 = new StringBuilder(B);
                    sb2.reverse();
                    B = sb2.toString();

            }

        }

        A = A.replace("a","1");
        A = A.replace("e","5");
        A = A.replace("i","3");
        A = A.replace("o","2");
        A = A.replace("u","4");

        B = B.replace("a","1");
        B = B.replace("e","5");
        B = B.replace("i","3");
        B = B.replace("o","2");
        B = B.replace("u","4");

        String encryptedData = B + A;

        System.out.println("The encrypted data is : "+ encryptedData);
    }

}
