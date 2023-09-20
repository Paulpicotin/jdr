package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Elfe implements IClass {
    int vie;
    int magie; 
    int mana;
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Elfe> statistic = new ArrayList<>(0);
   
    public void Create(Player player) {
        Elfe elfe = new Elfe();        
        elfe.vie = 2;
        elfe.magie = 10;
        elfe.mana = 8;
        elfe.force = 5; 
        elfe.intelligence = 8;
        elfe.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(elfe);
        player.setStatistic(statistic);
    }
    
}
