package com.example.gof.creational.factorymethod;

public class PotionFactory extends ItemFactory {
    @Override
    public Item createItem() {
        return new Potion();
    }
}
