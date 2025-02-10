package com.Parth.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Start the player");
    }

    @Override
    public void stop() {
        System.out.println("Stop the player");
    }
}
