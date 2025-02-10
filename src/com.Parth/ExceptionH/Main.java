package com.Parth.ExceptionH;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                // Exception is an event that interrupts the normal flow of the program
                // (Dividing by Zero, file not found, mismatch input type)
                // surround any dangerous section of code with a try{} block
                // try{}, catch{}, finally{} --> optional

//        int a = 5;
//        int b = 0;
        Scanner sc = new Scanner(System.in);
        try {
//           int c = div (a, b);
            System.out.println("Enter no");
            int a = sc.nextInt();
        } catch (Exception e) {
//            System.out.println("Enter a number!");
        } finally {
            System.out.println("this will always run");
        }
    }

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Do not divde no by zero");
        }
        return a/b;
    }
}
