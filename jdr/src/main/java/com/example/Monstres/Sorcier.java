package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Sorcier extends Monster implements IMonstres {
    List<Sorcier> statistic = new ArrayList<> ();
    int force;
    int magie; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 

     Sorcier(String name) {
        super(name, null);
        
    }
    @Override
    public void CreationStatistique() {
        Sorcier sorcier = new Sorcier(null);
        sorcier.vie = 3;
        sorcier.magie = 10; 
        sorcier.chance = chance + random.nextInt(5);
        sorcier.force = 1;
        statistic.add(sorcier);
    }
    
}
