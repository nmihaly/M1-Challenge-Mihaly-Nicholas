package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Character character;
    Character character2;

    @Before
    public void setUp() {
        character = new Character("Nick",75,100,50,
                30, 10,true, false, false,false);
        character2 = new Character("Andreas",70,100,50,
                30, 5,false, false, false,false);
    }

    @Test
    public void shouldAttackAndReduceEnemyHealthByAttackPower() {
        character.attack(character2);
        assertEquals(90, character2.getHealth());
    }

    @Test
    public void shouldDecreaseCharacterHealthByAttackPower() {
        character2.decreaseHealth(character.getAttackPower());
        assertEquals(90,character2.getHealth());
    }


}