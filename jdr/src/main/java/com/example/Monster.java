package com.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.text.html.parser.Entity;



public class Monster implements IEntity {
    String name ;
    String nulle = "";
    String  dragon =  "Dragon";
    String  gobelin = "Gobelin";
    String  demon =  "Demon";
    String  sorcier =   "Sorcier";
    String  pillard =  "Pillard";
    String  araignee = "Araignee";
    String  geant = "Geant";
    String  loup =  "Loup";
    String  hamster = "Hamster";
    String  troll = "Troll";
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<String> monsterTypeList = new ArrayList<>(0);
    Random r = new Random();
    int i = 0; 
    
    protected Monster(String name, List<Monster> statistic){
        this.name = this.GetNameMonster(); 
        monsterTypeList.add(nulle);
        monsterTypeList.add(dragon);
        monsterTypeList.add(gobelin);
        monsterTypeList.add(demon);
        monsterTypeList.add(sorcier);
        monsterTypeList.add(pillard);
        monsterTypeList.add(araignee);
        monsterTypeList.add(geant);
        monsterTypeList.add(loup);
        monsterTypeList.add(hamster);
        monsterTypeList.add(troll);
        i = r.nextInt(10);
    }

    @Override
    public Player setTarget(Player player) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setTarget'");
    }

    @Override
    public Entity DefineMonster(Entity entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'DefineMonster'");
    }

    @Override
    public String GetNameMonster() {
        name = monsterTypeList.get(i) ;
        System.out.println(name);
        return name; 
    }

}
