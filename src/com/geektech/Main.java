package com.geektech;

public class Main {

    public static void main(String[] args) {
        Boss thanos = new Boss();
        thanos.setHealth(500);
        thanos.setDamage(70);
        thanos.setDefenceType("Magical");
        System.out.println(thanos.getHealth()+" "+thanos.getDamage()+" "+thanos.getDefenceType());
    }
}
