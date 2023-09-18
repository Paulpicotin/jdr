package com.example;

class Player {
    int vie ; 
    String pseudo ;
    String class1;  
    String inventaire[] ;


    Player player (int vie, String pseudo , String class1 , String inventaires[]) {
        
        return player(10, "", "", inventaire);
    }


    public int getVie() {
        return vie;
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


    public void setVie(int vie) {
        this.vie = vie;
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




}
