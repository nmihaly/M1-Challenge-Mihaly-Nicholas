package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterApplicationTest {
    Converter convertIf;
    Converter convertSwitch;

    @Before
    public void setUp() {
        convertIf = new ConverterIf();
        convertSwitch = new ConverterSwitch();
    }


@Test
public void ifElseTest() {

    assertEquals("January", convertIf.convertMonth(1));
    assertEquals("Tuesday", convertIf.convertDay(3));
    assertEquals("Error: Invalid input", convertIf.convertMonth(14));
    assertEquals("Error: Invalid input", convertIf.convertDay(8));
}

@Test
public void switchTest() {
    assertEquals("January", convertSwitch.convertMonth(1));
    assertEquals("Tuesday", convertSwitch.convertDay(3));
    assertEquals("Error: Invalid input", convertSwitch.convertMonth(14));
    assertEquals("Error: Invalid input", convertSwitch.convertDay(8));
}
}
