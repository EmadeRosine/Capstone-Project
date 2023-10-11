package com.company;
import java.util.Scanner;
class Game {
    private Player player;
    private Dragon dragon;
    private Scanner scanner;
    public Game(Player player, Dragon dragon) {
        this.player = player;
        this.dragon = dragon;
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        System.out.println("Welcome to the Text RPG Game!");
        while (!checkGameOver()) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    handleInventory();
                    break;
                case 2:
                    handleShop();
                    break;
                case 3:
                    handleDragonCave();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void displayMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Inventory");
        System.out.println("2. Shop");
        System.out.println("3. Dragon's Cave");
        System.out.println("Enter your choice (1-3): ");
    }

    public void handleInventory() {
        player.inventory.display();
        System.out.println("Inventory Menu:");
        System.out.println("1. Use Potion");
        System.out.println("2. Back to Main Menu");
        System.out.println("Enter your choice (1-2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                player.drinkPotion();
                break;
            case 2:
                break; // Do nothing, as it's back to the main menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void handleShop() {
        // Logic to handle shop sub-menu options
    }

    public void handleDragonCave() {
        System.out.println("You entered the Dragon's Cave!");
        player.attack(dragon);
    }

    public boolean checkGameOver() {
        if (player.getHealth() <= 0) {
            System.out.println("Game Over! You were defeated by the dragon.");
            return true;
        } else if (dragon.getHealth() <= 0) {
            System.out.println("Congratulations! You defeated the dragon!");
            return true;
        }
        return false;
    }
}

