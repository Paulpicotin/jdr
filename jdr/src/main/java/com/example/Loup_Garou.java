package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Loup_Garou implements IClass {
int vie;
    int magie; 
    int mana; 
    int force; 
    int chance = 1; 
    int intelligence;
    Random random = new Random(); 
    List<Loup_Garou> statistic = new ArrayList<>(0);
   


    public void Create(Player player) {
        Loup_Garou loup_Garou = new Loup_Garou(); 
        loup_Garou.vie = 200;
        loup_Garou.magie = 10;
        loup_Garou.mana = 25;
        loup_Garou.force = 15; 
        loup_Garou.intelligence = 7;
        loup_Garou.chance = chance + random.nextInt(5) ;
        // int statistic [] = {vie , magie, mana, force, chance, intelligence};
        statistic.add(loup_Garou);
        player.setStatistic(statistic);
    }
}
