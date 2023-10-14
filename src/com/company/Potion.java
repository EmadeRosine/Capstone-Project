package com.company;

public class Potion extends Item {
    private int healthIncreasePercentage;

    public Potion(String name, String type, int effect, int level, int price, int healthIncreasePercentage) {
        super(name, type, effect, level, price);
        this.healthIncreasePercentage = healthIncreasePercentage;
    }

    public void setHealthIncreasePercentage(int healthIncreasePercentage) {
        this.healthIncreasePercentage = healthIncreasePercentage;
    }


    public double getHealthIncreasePercentage() {
        return healthIncreasePercentage;
    }

    public int getHealthRestore() {
        return 0;
    }
}
