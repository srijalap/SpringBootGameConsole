package com.example.maintenance;

import org.springframework.stereotype.Component;

@Component

public class SuperMario implements Game {

    // Additional fields or methods specific to SuperMario can be added here

    @Override
    public void start() {
        System.out.println("SuperMario started at position");
    }

    @Override
    public void up() {
        System.out.println("SuperMario jumps up");
    }

    @Override
    public void down() {
        System.out.println("SuperMario jumps down");
    }

    @Override
    public void left() {
        System.out.println("SuperMario jumps left");
    }

    @Override
    public void right() {
        System.out.println("SuperMario jumps right");
    }
}
