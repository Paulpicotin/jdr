package com.example;

//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Class class1 = new Class();
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez vous creer un personnage? 1= oui 0= non");
        int str = sc.nextInt();
        int oui = 1;
        if (str == oui){
            Scanner sc2 = new Scanner(System.in);
             player.setVie(10);
             System.out.println("veuillez entrer votre pseudo");
             String str2 = sc2.nextLine();
             player.setPseudo(str2);
             player.getInventaire();
            System.out.println("veuillez choisir votre classe");
            String str3 = sc2.nextLine();
            class1.setClasse(str3);
            class1.CheckClasse(str3);
            player.setClass1(class1.classe); 
        }       
        System.out.println(player.pseudo);
        System.out.println(player.class1);
        System.out.println(player.vie + " points de vie");
        System.out.println(java.util.Arrays.toString(player.inventaire));
    }
}
