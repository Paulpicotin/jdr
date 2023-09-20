package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Demon extends Monster implements IMonstres {

    List<Demon> statistic = new ArrayList<> ();
    int force; 
    int magie;
    int chance = 1;
    int vie; 
    Random random = new Random(); 

     protected Demon(String name) {
        
        super(name, null);
        
    }
    @Override
    public void CreationStatistique() {
        Demon demon = new Demon (null);
        demon.vie = 4;
        demon.magie = 8;  
        demon.chance = chance + random.nextInt(5);
        demon.force = 3;
        statistic.add(demon);
    }
    
}
