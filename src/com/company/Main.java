package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Shop shop= new Shop();
        Player player= new Player("Rosine",5,5,5,100,100,new Inventory(200));
        Dragon dragon= new Dragon(3,"red");
        Game game = new Game(player,dragon);



    }
}


