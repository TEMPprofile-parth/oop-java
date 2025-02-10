package com.Parth.interfaces;

import java.sql.SQLOutput;

public class EleEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting tesla");
    }

    @Override
    public void stop() {
        System.out.println("Stopping tesla");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating tesla");
    }
}
