package com.example.gof.creational.prototype;

public class Orc extends Enemy {

    public Orc() {
        super("Orc", 100, 15);
    }

    @Override
    public void attack() {
        System.out.println("Orc attacks with an axe!");
    }
}
