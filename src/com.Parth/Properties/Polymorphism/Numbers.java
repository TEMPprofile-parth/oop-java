package com.Parth.Properties.Polymorphism;

public class Numbers {

    double sum(double a, int b) {
        return a + b;
    }
    double sum(int a, int b) {
        return a + b;
    }
    double sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers();

        n1.sum(2, 2);
        n1.sum(1, 3,5);
    }
}
