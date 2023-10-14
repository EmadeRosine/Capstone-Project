package com.company;

public class Armor extends Item{
    int defence_added;
    public Armor(String name, String type, int effect, int level, int price, int defence_added) {
        super(name, type, effect, level, price);
        this.defence_added = defence_added;
    }
}
