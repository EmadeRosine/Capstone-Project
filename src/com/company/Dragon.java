package com.company;

public class Dragon {
    private int level;
    private String type; // Green, Blue, Red, Black, Gold
    private int attack;
    private int defense;
    private int health;

    public Dragon(int level, String type) {
        this.level = level;
        this.type = type;
        // Initialize other properties based on level and type
    }

    public void attack(Player player) {
        // Logic for dragon attacking the player
    }

    public void defend(int damage) {
        // Logic for dragon defending against the player's attacks
    }

    public int getHealth() {
        return 0;
    }

    public String getType() {
        return type;
    }

// Other getters and setters
}

