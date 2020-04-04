package com.RAAL.x00032219;

public class Elixir extends HealthItem{
    private int amount;
    private int time;

    public Elixir(String name, int weight, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    public void drink(){

    }

    @Override
    public String toString() {
        return "Elixir" +
                "\namount: " + amount +
                "\n time: " + time +
                "\n reuseTime: " + reuseTime +
                "\n level: " + level +
                "\n type: " + type +
                "\n id: " + id +
                "\n name: " + name +
                "\n weight: " + weight +
                "\n description:" + description ;
    }
}
