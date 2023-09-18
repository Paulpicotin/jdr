package com.example;

class Class  {
    String classe ;
    String Classes[] = {"elfe noir", "elfe", "mi-humain", "humain","nain","homme-bete","loup-garou", "vampire"}; 


    Class (String classe){
    Player player = new Player();
    if (player.getClass1() != Classes.toString()){
        System.out.println("vous devez choisir une classe valide");
        classe = ""; 
        player.setClass1(classe);
    }
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    };
    
}
