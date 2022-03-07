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
    public void shouldAddSprinkles() {
        iceCream.addSprinkles();
        assertTrue(iceCream.hasSprinkles());
    }

    @Test
    public void shouldHaveNoSprinkles() {
        iceCream.noSprinkles();
        assertFalse(iceCream.hasSprinkles());
    }

    @Test
    public void shouldMeasureQuantityAfterScoops() {
        iceCream.scoop(3);
        assertEquals(23, iceCream.getQuantity());
    }

    @Test
    public void shouldGetSalePrice() {
        iceCream.sell(2);
        assertEquals(7,iceCream.getPrice(), 000.1);
    }

}