package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstableTest extends CharacterTest {
    Constable constable;
    Character character;

    @Before
    public void setUp() {
        constable = new Constable("Bob", 60, 100, 60,
                20, 5, false, false, "Test Town");
        character = new Character("Nick", 75, 100, 50,
                30, 10, true, false, false, false);
    }

    @Test
    public void shouldAttackAndReduceEnemyHealthByAttackPower() {
        constable.attack(character);
        assertEquals(95, character.getHealth());
    }



    @Test
    public void shouldGetJurisdiction() {
        constable.getJurisdiction();
        assertEquals("Test Town", constable.getJurisdiction());
    }

    @Test
    public void shouldArrestEnemyByName() {
        constable.arrestEnemy(character);
        assertEquals("Nick you are under arrest!", character.getName() + " you are under arrest!");
    }
}