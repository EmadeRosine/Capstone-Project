package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Inventory {

    List<String> weapons = List.of(
            "Sword of Destiny",
            "Ethereal Bow",
            "Staff of Arcane Power",
            "Dragon's Fang",
            "Elven Blade",
            "Thunderstrike Mace",
            "Dagger of Shadows",
            "Celestial Lance",
            "Phoenix Wing Bow",
            "Golem Hammer",
            "Scepter of the Elements",
            "Vorpal Rapier",
            "Frostbite Axe",
            "Wand of Illusions",
            "Soul Reaver",
            "Aegis Shield",
            "Blade of Eternal Light",
            "Whispering Dagger",
            "Mjolnir, the Thunder Hammer",
            "Shardblade"
    );
    List<String> armor = List.of(
            "Aegis Shield",
            "Guardian's Bulwark",
            "Shield of Reflection",
            "Crystal Barrier",
            "Dragon Scale Shield",
            "Ancient Ward",
            "Divine Protector",
            "Shadowguard",
            "Titanium Tower Shield",
            "Embersteel Shield"
    );

    List<String> potions = List.of(
            "Potion of Healing",
            "Elixir of Strength",
            "Draught of Invisibility",
            "Potion of Elemental Resistance",
            "Potion of Speed",
            "Elixir of Wisdom",
            "Potion of Fire Breath",
            "Potion of Levitation",
            "Potion of Luck",
            "Elixir of Vitality"
    );

    private HashMap<String,Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new HashMap<>();
    }

    /**
     * Constructor takes a player level and populates his inventory
     * with items
     * @param capacity Storage capacity of inventory
     * @param player_level level of the player
     */
    public Inventory(int capacity, int player_level) {
        this.capacity = capacity;
        this.items = new HashMap<>();
        List<List> all_types = List.of(weapons,armor,potions);
        for (int i = 0; i < capacity ; i++)
        {
            Random random = new Random();
            int radomindex = random.nextInt(all_types.size());
            List<String> selectedList = all_types.get(radomindex);
            String weapon_type;
            if( radomindex == 0)
            {
                weapon_type = "weapons";
            }
           else if( radomindex == 1)
            {
                weapon_type = "armor";
            }
           else{
                weapon_type = "portion";
            }
            Item anitem = new Item(selectedList.get(random.nextInt(selectedList.size())),weapon_type,10,player_level,200);
            anitem.setEquiped(false);
            items.put(anitem.getName(),anitem);
        }
    }

    public void addItem(Item item) {
        if (items.size() < capacity) {
            items.put(item.getName(),item);
            System.out.println(item.getName() + " added to the inventory.");
        } else {
            System.out.println("Inventory is full. Cannot add " + item.getName());
        }
    }

    public void display() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Item item : items.values()
                 ) {
                System.out.println("Item=" + item.getName() + " level=" + item.getLevel() + " type=" + item.getType() + " effect:" + item.getEffect());
            }
        }
    }

    public Item selectItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    public void discardItem(Item item) {
        items.remove(item);
        System.out.println(item.getName() + " discarded from the inventory.");
    }

    public int getTotalWeaponDamage() {
        return 0;
    }

    public Potion selectPotion() {
        return selectPotion();
    }


}


