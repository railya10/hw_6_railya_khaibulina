package com.company;

public class Skeleton extends Boss {

    private int arrows;

    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo (){
        return getHealth() + " " + getDamage() + " " + getArrows();
    }
    public Skeleton(int health, int damage, int arrows) {
        super(health, damage);
        this.arrows = arrows;
    }
}
