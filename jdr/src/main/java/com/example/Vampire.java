package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Vampire implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Vampire> statistic = new ArrayList<>(0);
   


    public void Create(Player player) {
        Vampire vampire = new Vampire();
        vampire.vie = 5;
        vampire.magie = 11;
        vampire.mana = 7;
        vampire.force = 7; 
        vampire.intelligence = 13;
        vampire.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(vampire);
        player.setStatistic(statistic);
    }
    
    
}
