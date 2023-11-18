package com.example.maintenance;

public class GameRunner {

    public static void main(String[] args) {
        runGame(new PacMan());
        runGame(new SuperMario());
        runGame(new DonkeyKong());
    }

    public static void runGame(Game game) {
        System.out.println("Running " + game.getClass().getSimpleName() + " game:");
        game.start();
        game.up();
        game.down();
        game.left();
        game.right();
        System.out.println();
    }
}
