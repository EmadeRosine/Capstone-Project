package com.company;

public class Item{

    //from project item should have type level and effect
    private String name;
    private String type; // weapon, armor, potion, etc.
    private int effect; // damage bonus or health restore
    private int level;

    private  int price;

    public Item(String name, String type, int effect, int level, int price) {
        this.name = name;
        this.type = type;
        this.effect = effect;
        this.level = level;
        this.price = price;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
