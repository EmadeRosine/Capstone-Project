package com.company;

public class Potion extends Item {
    private double healthIncreasePercentage;

    public Potion(String name, String type,int effect) {
        super(name,type,effect);
        this.healthIncreasePercentage = healthIncreasePercentage;
    }

    //Getters and setters for all variables


    public double getHealthIncreasePercentage() {
        return healthIncreasePercentage;
    }

    public int getHealthRestore() {
        return 0;
    }
}
