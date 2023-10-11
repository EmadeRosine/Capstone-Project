package com.company;

public class Item{
    private String name;
    private String type; // weapon, armor, potion, etc.
    private int effect; // damage bonus or health restore

    public Item(String name, String type, int effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getEffect() {
        return effect;
    }
    public void use() {
        // Apply the effect of the item
        System.out.println("Using " + name + ". Effect: " + effect);
    }
}
