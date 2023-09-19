package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Humain implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random();
    List<Humain> statistic = new ArrayList<>(0); 

   


    public void Create(Player player) {
        Humain humain = new Humain(); 
        humain.vie = 75;
        humain.magie = 0;
        humain.mana = 0;
        humain.force = 20; 
        humain.intelligence = 50;
        humain.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(humain);
        player.setStatistic(statistic);
    }
}
