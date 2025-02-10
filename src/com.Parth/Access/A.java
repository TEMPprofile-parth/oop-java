package com.Parth.Access;

public class A {
    private int num;
    String name;
    int[] arr;

    public int get() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
