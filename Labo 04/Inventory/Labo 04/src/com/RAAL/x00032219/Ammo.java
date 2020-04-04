package com.RAAL.x00032219;

public class Ammo extends ReusableItem{
    private boolean equipped;

    public Ammo(String name, int weight, String description, int remainingUses, boolean equipped) {
        super(name, weight, description, remainingUses);
        this.equipped = equipped;
    }

    public void equip(){
    equipped = true;
    }

    @Override
    public String toString() {
        return "Ammo" +
                "\n equipped: " + equipped +
                "\n remainingUses: " + remainingUses +
                "\n id: " + id +
                "\n name: " + name +
                "\n weight: " + weight +
                "\n description: " + description;
    }
}
