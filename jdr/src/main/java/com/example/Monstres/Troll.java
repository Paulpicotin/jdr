package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Troll extends Monster implements IMonstres {
List<Troll> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
     Troll(String name) {
        super(name, null);
        
    }
    @Override
    public void CreationStatistique() {
        Troll troll = new Troll(null);
        troll.vie = 2; 
        troll.chance = chance + random.nextInt(5);
        troll.force = 3;
        statistic.add(troll);
    }
}
