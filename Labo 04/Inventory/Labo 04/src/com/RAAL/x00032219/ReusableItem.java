package com.RAAL.x00032219;

abstract class ReusableItem extends Item{
    protected int remainingUses;

    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    public void reduceUse(){

    }
    public boolean use(){
    return true;
    }
}
