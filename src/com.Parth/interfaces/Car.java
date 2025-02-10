package com.Parth.interfaces;

public class Car implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("braking the car");
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");

    }

    @Override
    public void acc() {
        System.out.println("accelarating the car");
    }
}
