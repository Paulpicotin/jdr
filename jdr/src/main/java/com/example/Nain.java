package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Nain implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Nain> statistic = new ArrayList<>(0);
   


    public void Create(Player player) {
        Nain nain = new Nain(); 
        nain.vie = 150;
        nain.magie = 5;
        nain.mana = 35;
        nain.force = 15; 
        nain.intelligence = 10;
        nain.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(nain);
        player.setStatistic(statistic);
    }
    
}
