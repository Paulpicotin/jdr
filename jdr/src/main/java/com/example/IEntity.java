package com.example;

import javax.swing.text.html.parser.Entity;

public interface IEntity {
    Player setTarget(Player player);
    String  GetName();
    Entity DefineMonster(Entity entity);
}
