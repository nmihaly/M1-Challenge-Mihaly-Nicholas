package com.company;

public class Constable extends Character {

    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina,
                     int speed, int attackPower, boolean running, boolean arrested,  String jurisdiction) {
        super("Bob", 60, 100, 60, 20, 5, false, false, false, false);
        this.jurisdiction = jurisdiction;

    }
   // inherits attack ability

    public void arrestEnemy(Character enemy){
        System.out.println(enemy.getName() + " you are under arrest!");
    }


    public String getJurisdiction() {
        return jurisdiction;
    }

}

