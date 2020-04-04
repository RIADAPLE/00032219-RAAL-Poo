package com.RAAL.x00032219;

public class Weapon extends ReusableItem{
    private String type;
    private double speed, damage;
    private String wieldType;
    private int level;

    public Weapon(String name, int weight, String description, int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    public void weapon(){

    }

    @Override
    public String toString() {
        return "Weapon" +
                "\ntype='" + type +
                "\n speed=" + speed +
                "\n damage=" + damage +
                "\n wieldType='" + wieldType +
                "\n level=" + level +
                "\n remainingUses=" + remainingUses +
                "\n id=" + id +
                "\n name='" + name +
                "\n weight=" + weight +
                "\n description='" + description;
    }
}
