package com.Parth.interfaces;

public class MyCar {
    private Engine engine;
    private Media player;

    public MyCar() {
        engine = new PetrolEngine();
        player = new CDPlayer();
    }

    public MyCar(Engine engine, CDPlayer player) {
        this.engine = engine;
        this.player = player;
    }

    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }
}
