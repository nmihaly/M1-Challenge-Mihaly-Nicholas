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

}

@Test
public void switchTest() {
    assertEquals("January", convertSwitch.convertMonth(1));
    assertEquals("Tuesday", convertSwitch.convertDay(3));

}

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWithInvalidInputs(){
       convertIf.convertMonth(0);
       convertIf.convertMonth(13);
       convertIf.convertDay(0);
       convertIf.convertDay(8);
        convertSwitch.convertMonth(0);
        convertSwitch.convertMonth(13);
        convertSwitch.convertDay(0);
        convertSwitch.convertDay(8);

    }
}
