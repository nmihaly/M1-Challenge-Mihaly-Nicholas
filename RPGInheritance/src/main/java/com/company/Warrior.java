package com.company;

public class Warrior extends Character {

    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower,
                   boolean running, boolean arrested, int shieldStrength) {
        super("Rick", 75, 100, 100, 50,
                10, false, false, false, false);
        this.shieldStrength = 100;
    }


    public int getShieldStrength() {
        return shieldStrength;
    }
    public void decreaseShieldStrength(int amount) {
        this.shieldStrength -= amount;
    }




}
