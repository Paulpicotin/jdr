package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Araignee extends Monster implements IMonstres {
    List<Araignee> statistic = new ArrayList<> (0);
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 


protected Araignee(String name, List<Monster> statistic) {
        
        super(name, statistic);
        
    }



    @Override
    public void CreationStatistique() {
        Araignee araignee = new Araignee(null , null);
        araignee.vie = 2; 
        araignee.chance = chance + random.nextInt(5);
        araignee.force = 3;
        statistic.add(araignee);
    }
    
}
