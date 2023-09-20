package com.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import javax.swing.text.html.parser.Entity;

class Monster implements IEntity {
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
    
    List<String> monsterTypeList = new ArrayList<>(0);
    Random r = new Random();
    int i = 0; 
    
    Monster(String name){
        this.name = name; 
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTarget'");
    }

    @Override
    public Entity DefineMonster(Entity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DefineMonster'");
    }

    @Override
    public String GetName() {
        name = monsterTypeList.get(i) ;
        System.out.println(name);
        return name; 
    }

}
