package com.Parth.ExceptionH;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
           int c = div (a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("always run");
        }
    }

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Do not divde no by zero");
        }
        return a/b;
    }
}
