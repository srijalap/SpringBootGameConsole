package com.example.maintenance;

public class PacMan implements Game {

    // Additional fields or methods specific to SuperMario can be added here

    @Override
    public void start() {
        System.out.println("Pacman started at position");
    }

    @Override
    public void up() {
        System.out.println("Pacman jumps up");
    }

    @Override
    public void down() {
        System.out.println("Pacman jumps down");
    }

    @Override
    public void left() {
        System.out.println("Pacman jumps left");
    }

    @Override
    public void right() {
        System.out.println("Pacman jumps right");
    }
}
