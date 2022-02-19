package com.company;

public class Farmer extends Character {

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower,
                  boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super("Brad", 75, 100, 75, 10, 1,
                false, false, false, false);
    }
// inherits methods:
//    public void attack(Character enemy) {
//        enemy.decreaseHealth(this.attackPower);
//    }
//    public void decreaseHealth(int amount) {
//        this.health -= amount;
//    }
}
