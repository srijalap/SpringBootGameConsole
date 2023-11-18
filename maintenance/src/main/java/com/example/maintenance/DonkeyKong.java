package com.example.maintenance;

import org.springframework.stereotype.Component;

@Component

public class DonkeyKong implements Game {

    @Override
    public void start() {
        System.out.println("DonkeyKong started at position");
    }

    @Override
    public void up() {
        System.out.println("DonkeyKong climbs up");
    }

    @Override
    public void down() {
        System.out.println("DonkeyKong climbs down");
    }

    @Override
    public void left() {
        System.out.println("DonkeyKong climbs left");
    }

    @Override
    public void right() {
        System.out.println("DonkeyKong climbs right");
    }
}
