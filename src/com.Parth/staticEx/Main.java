package com.Parth.staticEx;

public class Main {
    public static void main(String[] args) {
        Human parth = new Human(22, "Parth G", 10000, false);
        Human rahul = new Human(32, "Rahul G", 10400, true );

        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}