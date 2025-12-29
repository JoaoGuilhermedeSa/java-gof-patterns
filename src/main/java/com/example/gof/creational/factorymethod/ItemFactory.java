package com.example.gof.creational.factorymethod;

public abstract class ItemFactory {
    public abstract Item createItem();

    public String deliverItem() {
        Item item = createItem();
        return "Delivering: " + item.getName();
    }
}
