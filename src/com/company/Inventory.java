package com.company;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
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
            for (Item item : items) {
                System.out.println("- " + item.getName());
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


