package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcMethodsTest {

    private  static CalcMethods calc = new CalcMethods();

//
//        @Before
//        public void setUp() {
//            calc = new CalcMethods();
//        }

        @Test
        public void shouldAddInts() {

            String failMessage = "Expected calculator to handle integer addition.";

            assertEquals(failMessage,4, calc.add(2));
            assertEquals(failMessage,10, calc.add(5));
            assertEquals(failMessage,-6, calc.add(-3));
        }

    @Test
    public void shouldSubtractInts() {

        String failMessage = "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage,-1, calc.subtract(2, 3));
        assertEquals(failMessage,14, calc.subtract(12, -2));
        assertEquals(failMessage,9, calc.subtract(10, 1));
    }

    @Test
    public void shouldMultiplyInts() {
            
        String failMessage = "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage,6, calc.multiply(2, 3));
        assertEquals(failMessage,-24, calc.multiply(12, -2));
        assertEquals(failMessage,10, calc.multiply(10, 1));
    }

    @Test
    public void shouldDivideInts() {

        String failMessage = "Expected calculator to handle integer division.";

        assertEquals(failMessage,2, calc.divide(6, 3));
        assertEquals(failMessage,-6, calc.divide(12, -2));
        assertEquals(failMessage,10, calc.divide(10, 1));
    }

    @Test
    public void shouldAddDoubles() {

        String failMessage = "Expected calculator to handle double addition.";

        assertEquals(failMessage,4.3, calc.add(2.2d, 2.1d), .0001);
        assertEquals(failMessage,-1.0, calc.add(2.0d, -3d), .0001);
        assertEquals(failMessage,8.6, calc.add(7.1d, 1.5d), .0001);

    }

    @Test
    public void shouldSubtractDoubles() {

        String failMessage = "Expected calculator to handle double subtraction.";

        assertEquals(failMessage,-1.2, calc.subtract(2.5d, 3.7d), .0001);
        assertEquals(failMessage,15.2, calc.subtract(12.8, -2.4),.0001);
        assertEquals(failMessage,9.6, calc.subtract(10.9, 1.3d),.0001);
    }

    @Test
    public void shouldMultiplyDoubles() {

        String failMessage = "Expected calculator to handle double multiplication.";

        assertEquals(failMessage,9.25, calc.multiply(2.5d, 3.7d), .0001);
        assertEquals(failMessage,-30.72, calc.multiply(12.8, -2.4),.0001);
        assertEquals(failMessage,14.17, calc.multiply(10.9, 1.3d),.0001);
    }

    @Test
    public void shouldDivideDoubles() {

        String failMessage = "Expected calculator to handle double division.";

        assertEquals(failMessage,6.2, calc.divide(2.5d, 3.7d), .0001);
        assertEquals(failMessage,-5.33, calc.divide(12.8, -2.4),.0001);
        assertEquals(failMessage,8.38, calc.divide(10.9, 1.3d),.0001);
    }
}
