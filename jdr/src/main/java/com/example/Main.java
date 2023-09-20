package com.example;

import java.io.IOException;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Voulez vous creer un personnage? 1= oui 0= non");
            int str = sc.nextInt();
            int oui = 1;
            if (str == oui){
                player.CreatePlayer();
            }
        }
        System.out.println(player.pseudo);
        System.out.println(player.class1);
        System.out.println(java.util.Arrays.toString(player.inventaire));

        
    }
}
