package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Dragon extends Monster implements IMonstres {

   List<Dragon> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
    Dragon(String name) {
        super(name, null);
    }

    @Override
    public void CreationStatistique() {
        Dragon dragon = new Dragon(null);
        dragon.vie = 5; 
        dragon.chance = chance + random.nextInt(5);
        dragon.force = 10;
        statistic.add(dragon);   
    }
    
}
