package com.example;

class Entity {

    Monster monster ;
    String name;
    Entity(String name){
        this.name = name;
    };
    Entity CreateEntity(){
        Entity entity = new Entity(name);

        return entity;
    }
}
 