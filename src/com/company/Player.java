package com.company;


public class Player {
    private String name;
    private int attack;
    private int defense;
    private int health;
    private int goldCoins;
    private int experiencePoints;
    Inventory inventory;

    public Player(String name, int attack, int defense, int health, int goldCoins, int experiencePoints,Inventory inventory) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.goldCoins = goldCoins;
        this.experiencePoints = experiencePoints;
        this.inventory = inventory;
    }

    public void attack(Dragon dragon) {
        int playerDamage = calculatePlayerDamage();
        dragon.defend(playerDamage);
        System.out.println("You attacked the " + dragon.getType() + " dragon and dealt " + playerDamage + " damage.");
    }

    public void drinkPotion() {
        Potion potion = inventory.selectPotion();
        if (potion != null) {
            int healthRestore = potion.getHealthRestore();
            health += healthRestore;
            if (health > 100) {
                health = 100; // Health cannot exceed the maximum value (assuming max health is 100)
            }
            System.out.println("You drank a potion and restored " + healthRestore + " health. Current health: " + health);
        } else {
            System.out.println("No potions available in the inventory.");
        }
    }

    public void flee() {
        // Logic for attempting to flee from the dragon
        System.out.println("You attempted to flee.");
    }

    private int calculatePlayerDamage() {
        // Logic to calculate player damage based on attack, weapon, etc.
        return attack + inventory.getTotalWeaponDamage();
    }

    public int getGold() {
        return goldCoins;
    }

    public int getHealth() {
        return health;
    }

    public void addItem(Item itemToBuy) {
    }

    public void decreaseGold(int price) {
    }

    public void removeItem(Item itemToSell) {
    }

    public void increaseGold(int sellPrice) {
    }

    // Other getters and setters
}
