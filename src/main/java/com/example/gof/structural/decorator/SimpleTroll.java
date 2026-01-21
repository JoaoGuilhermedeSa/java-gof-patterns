package com.example.gof.structural.decorator;

public class SimpleTroll implements Troll {
    @Override
    public String attack() {
        return "The troll tries to grab you!";
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
}
