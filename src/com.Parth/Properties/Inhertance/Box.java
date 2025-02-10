package com.Parth.Inhertance;

import java.sql.SQLOutput;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

//    cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

//    Cuboid
    Box(double length, double height, double width) {
        this.l = length;
        this.h = height;
        this.w = width;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void info() {
        System.out.println("Height of the box is " + this.h);
        System.out.println("length of the box is " + this.l);
        System.out.println("Width of the box is " + this.w);
    }
}
