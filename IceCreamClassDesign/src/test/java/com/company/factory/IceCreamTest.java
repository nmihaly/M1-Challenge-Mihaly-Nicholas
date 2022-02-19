package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    com.company.factory.IceCream iceCream;

    @Before
    public void setUp() throws Exception {
        iceCream = new com.company.factory.IceCream("Chocolate", 200.50, 4.50,
                30, new String[]{"Cocoa", "Eggs", "Cream", "Sugar"});
    }

    @Test
    public void shouldReplaceAnIngredient() {
        iceCream.replaceIngredient(3, "Brown Sugar");
        iceCream.getIngredients();
        String[] i = {"Cocoa", "Eggs", "Cream", "Brown Sugar"};
        assertArrayEquals(i, iceCream.getIngredients());
    }

    @Test
    public void shouldGetTotalSalePrice() {
        iceCream.getSalePrice(3.5);
        assertEquals(701.75, iceCream.getSalePrice(3.5), 0.0001);
    }


    @Test
    public void getProductionCost() {
        iceCream.getProductionCost(5);
        assertEquals(22.5, iceCream.getProductionCost(5), 0.0001);
    }


    @Test
    public void getProductionTime() {
        iceCream.getProductionTime(3);
        assertEquals(150, iceCream.getProductionTime(5), 0.0001);
    }
}