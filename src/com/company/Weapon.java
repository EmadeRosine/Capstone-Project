package com.company;

public class Weapon extends Item {
    int attack;
    public Weapon(String name, String type, int effect, int level, int price) {
        super(name, type, effect, level, price);
    }
    public Weapon(String name, String type, int effect, int level, int price, int attack) {
        super(name, type, effect, level, price);
        this.attack = attack;
    }
}
