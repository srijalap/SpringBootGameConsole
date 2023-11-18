package com.example.maintenance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private final Game pacMan;
    private final Game superMario;
    private final Game donkeyKong;

    @Autowired
    public GameRunner(@Qualifier("pacMan") Game pacMan,
                      @Qualifier("superMario") Game superMario,
                      @Qualifier("donkeyKong") Game donkeyKong) {
        this.pacMan = pacMan;
        this.superMario = superMario;
        this.donkeyKong = donkeyKong;
    }

    public void runGames() {
        runGame(pacMan);
        runGame(superMario);
        runGame(donkeyKong);
    }

    private void runGame(Game game) {
        System.out.println("Running " + game.getClass().getSimpleName() + " game:");
        game.start();
        game.up();
        game.down();
        game.left();
        game.right();
        System.out.println();
    }
}
