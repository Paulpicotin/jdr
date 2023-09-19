package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Mi_Humain implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Mi_Humain> statistic = new ArrayList<>(0);

   


    public void Create(Player player) {
        Mi_Humain mi_Humain = new Mi_Humain(); 
        mi_Humain.vie = 125;
        mi_Humain.magie = 5;
        mi_Humain.mana = 50;
        mi_Humain.force = 25; 
        mi_Humain.intelligence = 20;
        mi_Humain.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(mi_Humain);
        player.setStatistic(statistic);
    }
    
}
