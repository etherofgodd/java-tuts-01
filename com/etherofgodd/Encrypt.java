package com.etherofgodd;

import java.util.Scanner;

public class Encrypt {

    public void encrypt(){
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
            if(data.length() == 0){
                System.out.println("Data can't be empty");
                return;
            }
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
//                If it's even I repeated the same process.
//                But +1 won't be added to the half because it's already an even number;


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

        String Output = encryptedData.length() > 0 ? encryptedData : "Data can't be null";


        System.out.println("The encrypted data is : "+ Output);


    }

    public void decrypt(){
        Scanner decryptInput = new Scanner(System.in);
        System.out.println("Data to be Decrypted:");

        String decyptData = decryptInput.nextLine();

//        Initialized Substrings A and B as specified
        String C = "";
        String D = "";

//        Get the lent of the data input
        int dividedDecyptByTwo = decyptData.length() / 2;

        if(decyptData.length() < 3){
            if(decyptData.length() == 0){
                System.out.println("Encypted Data can't be empty");
                return;
            }
//            Here i checked to see if the length of the data entered is above 3, if it's not i threw an error :(
            System.out.println("Encrypted Data does not exceed the required limit");

        }else {
            if (decyptData.length() % 2 == 1){
//                if its an odd number, i add one to the end of the  half, making it even. then i use the substring method to return the
//                sub string from index 0, to exact half + 1 index
                C = decyptData.substring(0, dividedDecyptByTwo + 1);

//                Used the StringBuilder class to create a copy of A
                StringBuilder sb3 = new StringBuilder(C);

//                reversed the string as specified
                sb3.reverse();

//                assigned the reversed string
                C = sb3.toString();

//                  I Assigned B the rest of the string from the exact half + 1 index to the end
                D = decyptData.substring(dividedDecyptByTwo + 1);

                //Used the StringBuilder class to create a copy of B
                StringBuilder sb4 = new StringBuilder(D);

//                Reversed string as specified
                sb4.reverse();

//                assigned the reversed string;
                D = sb4.toString();



            } else {
//                If it's even i repeated the same process.
//                But +1 wont be added to the half because it's already an even number;


                C = decyptData.substring(0, dividedDecyptByTwo);
                StringBuilder sb3 = new StringBuilder(C);
                sb3.reverse();
                C = sb3.toString();


                D = decyptData.substring(dividedDecyptByTwo);
                StringBuilder sb4 = new StringBuilder(D);
                sb4.reverse();
                D = sb4.toString();

            }
        }

        C = C.replace("1","a");
        C = C.replace("5","e");
        C = C.replace("3","i");
        C = C.replace("2","o");
        C = C.replace("4","u");

        D = D.replace("1","a");
        D = D.replace("5","e");
        D = D.replace("3","i");
        D = D.replace("2","o");
        D = D.replace("4","u");

        String decryptedData = D + C;

        String DecryptOutpt = decryptedData.length() > 0 ? decryptedData : "Data can't be null";


        System.out.println("The encrypted data is : "+ DecryptOutpt);

    }

}
