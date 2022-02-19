package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest extends CharacterTest {
    Warrior warrior;
    Character character;

    @Before
    public void setUp() {
        warrior = new Warrior("Rick", 75, 100, 100, 50,
                10, false, false, 100);
        character = new Character("Nick", 75, 100, 50,
                30, 5, true, false, false, false);
    }


    @Test
    public void warriorShouldAttackEnemyCharacter() {
        warrior.attack(character);
        assertEquals(90, character.getHealth());
    }

    @Test
    public void decreaseHealth() {
        warrior.decreaseHealth(character.getAttackPower());
        assertEquals(95,warrior.getHealth());
    }

    @Test
    public void getShieldStrength() {
assertEquals(100, warrior.getShieldStrength());
    }

    @Test
    public void shouldDecreaseShieldStrength() {
        warrior.decreaseShieldStrength(character.getAttackPower());
        assertEquals(95, warrior.getShieldStrength());
    }
}