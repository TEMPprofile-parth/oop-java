package com.Parth.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();

        Singleton ob2 = Singleton.getInstance();
        
        Singleton ob3 = Singleton.getInstance();
    }
}
