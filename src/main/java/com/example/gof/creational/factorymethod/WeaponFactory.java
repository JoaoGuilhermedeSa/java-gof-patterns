package com.example.gof.creational.factorymethod;

public class WeaponFactory extends ItemFactory {
    @Override
    public Item createItem() {
        return new Weapon();
    }
}
