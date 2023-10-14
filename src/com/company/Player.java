package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    private String name;
    private int attack;
    private int defense;
    private int health;
    private int goldCoins;
    private int experiencePoints;
    private HashMap<String,Item> Equiped_item = new HashMap<>();
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
        for (Item equippedItem : Equiped_item.values())
        {
            if(equippedItem.getType().equals("weapon"))
            {
                attack = attack + equippedItem.getEffect();
            }
        }
        return attack;
    }

    private int calculatePlayerDefense() {
        for (Item equippedItem : Equiped_item.values())
        {
            if(equippedItem.getType().equals("amor"))
            {
                attack = attack + equippedItem.getEffect();
            }
        }
        return attack;
    }

    public void equip_equipment(String item_name)
    {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public HashMap<String, Item> getEquiped_item() {
        return Equiped_item;
    }

    public void setEquiped_item(HashMap<String, Item> equiped_item) {
        Equiped_item = equiped_item;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
// Other getters and setters
}
