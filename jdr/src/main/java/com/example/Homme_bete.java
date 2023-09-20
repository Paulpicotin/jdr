package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Homme_bete implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Homme_bete> statistic = new ArrayList<>(0);
   


    public void Create(Player player) {
        Homme_bete homme_bete = new Homme_bete(); 
        homme_bete.vie = 4;
        homme_bete.magie = 5;
        homme_bete.mana = 3;
        homme_bete.force = 10; 
        homme_bete.intelligence = 8;
        homme_bete.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(homme_bete);
        player.setStatistic(statistic);
    }
    
}
