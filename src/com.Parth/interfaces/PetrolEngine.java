package com.Parth.interfaces;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting the engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating the engine");
    }
}
