package com.example;

import java.util.Scanner;

class Player { 
    String pseudo ;
    String class1;  
    String inventaire[];
    int statistic [];


    Player player (String pseudo , String class1 , String inventaires[], int statistic[]) {
        
        return player("", "", inventaire, statistic);
    }   


    public String getPseudo() {
        return pseudo;
    }

    public String getClass1() {
        return class1;
    }


    public String[] getInventaire() {
        return inventaire;
    } 

    public int[] getStatistic() {
        return statistic;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }


    public void setClass1(String class1) {
        this.class1 = class1;
    }


    public void setInventaire(String[] inventaire) {
        this.inventaire = inventaire;
    }
    
    public void setStatistic(int[] statistic) {
        this.statistic = statistic;
    }

    Player CreatePlayer(){
        Class class1 = new Class();
        Scanner sc2 = new Scanner(System.in);        
             System.out.println("veuillez entrer votre pseudo");
             String str2 = sc2.nextLine();
             this.setPseudo(str2);
             this.getInventaire();
            System.out.println("veuillez choisir votre classe");
            String str3 = sc2.nextLine();
            class1.setClasse(class1.CheckClasse(str3));
            this.setClass1(class1.classe);
            this.DefineClass(str3);
        return this;
    }


    private void DefineClass(String str) {

        switch (str){
            case "elfe noir":
            Elfe_Noir elfe_Noir = new Elfe_Noir();
            elfe_Noir.Create(this);
            break;
            case "elfe":
            Elfe elfe = new Elfe()
            ;
            break;
            case "Nain":
            Nain nain = new Nain()
            ;
            break;
            case "Homme-bete":
            Homme_bete homme_bete = new Homme_bete()
            ;
            break;
            case "Loup-garou":
            Loup_Garou loup_Garou = new Loup_Garou()
            ;
            break;
            case "Vampire":
            Vampire vampire = new Vampire()
            ;
            break;
            case "Humain":
            Humain humain = new Humain()
            ;
            break;
            case "Mi-humain":
            Mi_Humain mi_Humain = new Mi_Humain()
            ;
            break;
            default :
            System.out.println(
                "une erreur est survenu veuillez reessayer"
            );
        }
        }


}
