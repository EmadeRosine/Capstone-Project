package com.company;

import java.util.ArrayList;
import java.util.List;


public class Shop {
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
    private ArrayList<Item> availableItems;
    private ArrayList<Integer> itemPrices;
    private ArrayList<Item> playerSellableItems;
    private ArrayList<Integer> sellPrices;

    public Shop() {
        availableItems = new ArrayList<>();
        itemPrices = new ArrayList<>();
        playerSellableItems = new ArrayList<>();
        sellPrices = new ArrayList<>();
    }

    public void displayItemsForSale() {
        System.out.println("Items available for purchase:");
        for (int i = 0; i < availableItems.size(); i++) {
            System.out.println(i + ". " + availableItems.get(i).getName() + " - Price: " + itemPrices.get(i));
        }
    }

    public void displayItemsForSell() {
        System.out.println("Items you can sell:");
        for (int i = 0; i < playerSellableItems.size(); i++) {
            System.out.println(i + ". " + playerSellableItems.get(i).getName() + " - Sell Price: " + sellPrices.get(i));
        }
    }

    public void buy(Player player, int index) {
        if (index >= 0 && index < availableItems.size()) {
            Item itemToBuy = availableItems.get(index);
            int price = itemPrices.get(index);

            if (player.getGold() >= price) {
                player.addItem(itemToBuy);
                player.decreaseGold(price);
                System.out.println("You bought " + itemToBuy.getName() + " for " + price + " gold coins.");
            } else {
                System.out.println("Not enough gold to buy this item.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void sell(Player player, int index) {
        if (index >= 0 && index < playerSellableItems.size()) {
            Item itemToSell = playerSellableItems.get(index);
            int sellPrice = sellPrices.get(index);

            player.removeItem(itemToSell);
            player.increaseGold(sellPrice);

            System.out.println("You sold " + itemToSell.getName() + " for " + sellPrice + " gold coins.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}



