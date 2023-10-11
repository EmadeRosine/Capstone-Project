package com.company;

import java.util.Scanner;

class Main {

        public static void main(String[] args) {
            boolean player_is = true;
            boolean choose_destination = true;
            while(player_is)
            {
                System.out.println("Welcome Adventurer\n Enter your name to start the quest:");
                Scanner scanner= new Scanner(System.in);
                Shop shop= new Shop();
                Player player= new Player(scanner.nextLine(),5,5,5,100,100,new Inventory(200));
                Dragon dragon= new Dragon(3,"red");
                Game game = new Game(player,dragon);
                System.out.println("Brave " + player.getName() + " proceed to choose");
                while(choose_destination)
                {
                    System.out.println(" 1)Shop\n 2)Dragon\n 3)Inventory\n 4)Cave");
                    String a  = scanner.nextLine();
                    if(a.equals("1"))
                    {
                        System.out.println("Welcome to shop " + player.getName() + " proceed to choose");
                        choose_destination = false;
                        shop.displayItemsForSale();
                    }
                    else if(a.equals("2"))
                    {
                        System.out.println("prepare to fight " + player.getName() + " proceed to choose");
                        choose_destination = false;
                    }
                    else if(a.equals("3"))
                    {
                        System.out.println("Welcome to inventory " + player.getName() + " proceed to choose");
                        choose_destination = false;
                    }
                    else if(a.equals("4"))
                    {
                        System.out.println("Welcome to Cave " + player.getName() + " proceed to choose");
                        choose_destination = false;
                    }

                }
                System.out.println(player.getName() + " JUST DIED");
                player_is = false;
            }

        }

    }



