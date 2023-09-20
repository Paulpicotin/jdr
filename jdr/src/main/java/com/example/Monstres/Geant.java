package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Geant extends Monster implements IMonstres {
List<Geant> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
     Geant(String name) {
        super(name, null);
        
    }
	@Override
	public void CreationStatistique() {
        Geant geant = new Geant(null);
        geant.vie = 7; 
        geant.chance = chance + random.nextInt(5);
        geant.force = 10;
        statistic.add(geant);
	}
    
}
