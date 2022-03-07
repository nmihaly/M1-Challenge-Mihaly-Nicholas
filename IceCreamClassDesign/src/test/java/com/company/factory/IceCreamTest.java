package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    com.company.factory.IceCream iceCream;

    @Before
    public void setUp() throws Exception {
        iceCream = new com.company.factory.IceCream("chocolate", 200.50, 4.50,
                30, new String[]{"Cocoa", "Eggs", "Cream", "Sugar"});
    }


    @Test
    public void getProductionTimePerGallon() {
        iceCream.totalProductionTime(3);
        assertEquals(90, iceCream.getProductionTime());
    }

    @Test
    public void shouldGetTotalSalePrice() {
        iceCream.totalSalePrice(5);
        assertEquals(1002.5, iceCream.getSalePrice(), 0.0001);
    }

    @Test
    public void shouldReturnProductionCostPerMinute() {
        iceCream.productionCostPerMinute();
        assertEquals(6.6833,iceCream.getSalePrice(), 0.0001);
    }
}