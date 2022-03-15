package com.company;

public class Boss extends GameEntity {

    public Boss(int health, int damage) {
        super(health, damage);

        }
    Weapon weapon1 = new Weapon();
    public Weapon getWeapon() {
        return weapon1;
    }
    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }
    public String printInfo (){
    return getHealth() + " " + getDamage() + " " + weapon1.getWeaponName() + " " + weapon1.getWeaponType();
    }
}
