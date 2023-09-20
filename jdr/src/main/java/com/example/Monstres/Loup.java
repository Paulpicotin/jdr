package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Loup extends Monster implements IMonstres {
List <Loup> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
     Loup(String name) {
        super(name, null);
        
    }
    @Override
    public void CreationStatistique() {
        Loup loup = new Loup(null);
        loup.vie = 2; 
        loup.chance = chance + random.nextInt(5);
        loup.force = 7;
        statistic.add(loup);
    }
    
}
