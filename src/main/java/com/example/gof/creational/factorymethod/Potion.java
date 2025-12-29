package com.example.gof.creational.factorymethod;

public class Potion implements Item {
    @Override
    public String use() {
        return "You drank the potion. Health restored!";
    }

    @Override
    public String getName() {
        return "Health Potion";
    }
}
