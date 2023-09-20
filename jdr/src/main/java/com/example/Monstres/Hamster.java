package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Hamster extends Monster implements IMonstres {
List <Hamster> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int magie;
    int vie; 
    Random random = new Random(); 
     Hamster(String name) {
        super(name, null);
        
    }
	@Override
	public void CreationStatistique() {
        Hamster hamster = new Hamster(null);
        hamster.vie = 10;
        hamster.magie = 10;
        hamster.chance = chance + random.nextInt(5);
        hamster.force = 10;
        statistic.add(hamster);
	}
    
}
