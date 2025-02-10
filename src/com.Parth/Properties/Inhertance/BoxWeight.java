package com.Parth.Inhertance;

import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
