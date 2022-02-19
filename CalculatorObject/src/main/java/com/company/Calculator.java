package com.company;

public class Calculator {


    public static void main(String[] args) {


        int int1 = 1;
        int int2 = 23;
        int int3 = 52;
        int int4 = 34;
        int int5 = 2;
        int int6 = 12;
        int int7 = 3;
        int int8 = 7;

        double double1 = 3.4;
        double double2 = 2.3;
        double double3 = 6.7;
        double double4 = 4.4;
        double double5 = 5.5;
        double double6 = 0.5;
        double double7 = 10.8;
        double double8 = 2.2;




        System.out.format("2 + 2 = %s%n",CalcMethods.add(int1));
        System.out.format("23 - 52 = %s%n",CalcMethods.subtract(int2, int3));
        System.out.format("34 * 2 = %s%n",CalcMethods.multiply(int4, int5));
        System.out.format("12 / 3 = %s%n",CalcMethods.divide(int6, int7));
        System.out.format("12 / 7 = %s%n",CalcMethods.divide2(int6, int8));

        System.out.format("3.4 + 2.3 = %s%n",CalcMethods.add(double1, double2));
        System.out.format("6.7 * 4.4 = %s%n",CalcMethods.multiply(double3, double4));
        System.out.format("5.5 - 0.5 = %s%n",CalcMethods.subtract(double5, double6));
        System.out.format("10.8 / 2.2 = %s%n",CalcMethods.divide(double7, double8));
    }



}
