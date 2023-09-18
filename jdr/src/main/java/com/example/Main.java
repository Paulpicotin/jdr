package com.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(); 
        player.setVie(10); 
        player.setPseudo("Kuro");
        player.getInventaire();
        Class class1 = new Class(player.class1);
        class1.setClasse("elfe noir");
        player.setClass1(class1.classe);

        

        System.out.println(player.pseudo);
        System.out.println(player.class1);
        System.out.println(player.vie + " points de vie");
        System.out.println(player.inventaire);
    }
}