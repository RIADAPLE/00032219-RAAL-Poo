package com.RAAL.x00032219;

abstract class Item {
    protected int id;
    protected String name;
    protected int weight;
    protected String description;

    public Item(){
    }

    public Item(String name, int weight, String description){
        this.id = IdGenerator.newIdGenerator();
        this.name = name;
        this.weight = weight;
        this.description = description;
    }
}
