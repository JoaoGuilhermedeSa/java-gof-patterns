package com.example.gof.creational.builder;

public class Hero {
    private final String name;
    private final String profession;
    private final int strength;
    private final int agility;
    private final int intelligence;
    private final String weapon;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.profession = builder.profession;
        this.strength = builder.strength;
        this.agility = builder.agility;
        this.intelligence = builder.intelligence;
        this.weapon = builder.weapon;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getWeapon() {
        return weapon;
    }

    public static class Builder {
        private final String name;
        private final String profession;
        private int strength;
        private int agility;
        private int intelligence;
        private String weapon;

        public Builder(String name, String profession) {
            this.name = name;
            this.profession = profession;
        }

        public Builder withStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder withAgility(int agility) {
            this.agility = agility;
            return this;
        }

        public Builder withIntelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
