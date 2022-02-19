package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest extends CharacterTest {
    Farmer farmer;
    Character character;

    @Before
    public void setUp() {
        farmer = new Farmer("Dan",75,100,75,
                10, 1,false, false, false,false);
        character = new Character("Andreas",70,100,50,
                30, 5,false, false, false,false);
    }

    @Test
    public void shouldAttackEnemy() {
        farmer.attack(character);
        assertEquals(99, character.getHealth());
    }

    @Test
    public void shouldShowDecreasedHealth() {
        farmer.decreaseHealth(character.getAttackPower());
        assertEquals(95, farmer.getHealth());
    }
}