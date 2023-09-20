package com.example.Monstres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.Monster;

public class Gobelin extends Monster implements IMonstres {

    List<Gobelin> statistic = new ArrayList<> ();
    int force; 
    int chance = 1;
    int vie; 
    Random random = new Random(); 
    Gobelin(String name) {
        super(name, null);
       
    }

	@Override
	public void CreationStatistique() {
        Gobelin gobelin = new Gobelin(null);
        gobelin.vie = 2; 
        gobelin.chance = chance + random.nextInt(5);
        gobelin.force = 6;
        statistic.add(gobelin);
	}
    
}
