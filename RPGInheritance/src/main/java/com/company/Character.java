package com.company;

public class Character{

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;
    private boolean plowing;
    private boolean harvesting;

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower,
                     boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public void attack(Character enemy) {
        enemy.decreaseHealth(this.attackPower);
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}