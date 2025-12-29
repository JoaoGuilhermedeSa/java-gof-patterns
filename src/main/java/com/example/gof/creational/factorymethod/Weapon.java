package com.example.gof.creational.factorymethod;

public class Weapon implements Item {
    @Override
    public String use() {
        return "You swing the weapon. Enemy takes damage!";
    }

    @Override
    public String getName() {
        return "Iron Sword";
    }
}
