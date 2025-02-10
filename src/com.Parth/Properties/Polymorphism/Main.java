package com.Parth.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes c = new Circle();
        Square q = new Square();

        s.area();
        c.area();
        q.area();
    }
}
