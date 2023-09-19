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
        vampire.vie = 250;
        vampire.magie = 20;
        vampire.mana = 50;
        vampire.force = 15; 
        vampire.intelligence = 25;
        vampire.chance = chance + random.nextInt(5) - 2 ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(vampire);
        player.setStatistic(statistic);
    }
    
    
}
