package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Elfe_Noir implements IClass {
    
    int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Elfe_Noir> statistic = new ArrayList<>(0);
   


    public void Create(Player player) {
        Elfe_Noir elfe_Noir = new Elfe_Noir(); 
        elfe_Noir.vie = 2;  // sur 5
        elfe_Noir.magie = 14; //sur 20
        elfe_Noir.mana = 5; // sur10
        elfe_Noir.force = 0; //sur 10
        elfe_Noir.intelligence = 13; //sur 20
        elfe_Noir.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(elfe_Noir);
        player.setStatistic(statistic);
    }
    
}
