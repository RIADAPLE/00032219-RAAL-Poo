package com.RAAL.x00032219;

public class Potion extends HealthItem{
    private int amount;

    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
    }

    public void drink(){

    }

    @Override
    public String toString() {
        return "Potion" +
                "\namount: " + amount +
                "\n reuseTime: " + reuseTime +
                "\n level: " + level +
                "\n type: " + type +
                "\n id: " + id +
                "\n name: " + name +
                "\n weight: " + weight +
                "\n description: " + description;
    }
}
