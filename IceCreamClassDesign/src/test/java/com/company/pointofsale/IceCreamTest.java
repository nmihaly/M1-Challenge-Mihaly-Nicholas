package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    com.company.pointofsale.IceCream iceCream;

    @Before
    public void setUp() throws Exception {
        iceCream = new com.company.pointofsale.IceCream("vanilla", 3.50);
    }

    @Test
    public void shouldMeasureRefillQuantity() {
        iceCream.refillQuantity(64.5);
        assertEquals(192, iceCream.getQuantity());
    }

    @Test
    public void shouldMeasureQuantityAfterScoops() {
        iceCream.scoop(3);
        iceCream.getQuantity();
        assertEquals(98, iceCream.getQuantity());
    }


    @Test
    public void shouldReduceQuantityPerSample() {
        iceCream.sample();
        iceCream.sample();
        assertEquals(126, iceCream.getQuantity());
    }
}