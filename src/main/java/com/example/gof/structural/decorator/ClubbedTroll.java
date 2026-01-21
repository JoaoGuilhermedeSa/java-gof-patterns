package com.example.gof.structural.decorator;

public class ClubbedTroll implements Troll {
    private final Troll decoratedTroll;

    public ClubbedTroll(Troll decoratedTroll) {
        this.decoratedTroll = decoratedTroll;
    }

    @Override
    public String attack() {
        return decoratedTroll.attack() + " The troll swings at you with a club!";
    }

    @Override
    public int getAttackPower() {
        return decoratedTroll.getAttackPower() + 10;
    }
}
