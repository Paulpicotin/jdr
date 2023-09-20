package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Pillard extends Monster implements IMonstres {
    List<Pillard> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
     Pillard(String name) {
        super(name, null);
        
    }
    @Override
    public void CreationStatistique() {
        Pillard pillard = new Pillard(null);
        pillard.vie = 3; 
        pillard.chance = chance + random.nextInt(5);
        pillard.force = 5;
        statistic.add(pillard);
    }
    
}
