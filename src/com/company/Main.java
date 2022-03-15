package com.company;

public class Main {



    public static void main(String[] args) {

        Skeleton skeleton1 = new Skeleton(300, 15, 50);
        Skeleton skeleton2 = new Skeleton(320, 18, 45);
        System.out.println("Skeleton1: " + skeleton1.printInfo());
        System.out.println("Skeleton2: " + skeleton2.printInfo());


        Boss boss1 = new Boss(700, 30);
        boss1.weapon1.setWeaponName("Lightning");
        boss1.weapon1.setWeaponType("Laser");
        System.out.println("Boss1: " + boss1.printInfo());
    }


}
