package com.example.gof.creational.prototype;

public abstract class Enemy implements Cloneable {
    private String type;
    private int health;
    private int damage;

    public Enemy(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attack();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
