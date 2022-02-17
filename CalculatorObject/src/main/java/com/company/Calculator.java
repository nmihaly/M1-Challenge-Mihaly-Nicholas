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




        System.out.println(CalcMethods.add(int1));
        System.out.println(CalcMethods.subtract(int2, int3));
        System.out.println(CalcMethods.multiply(int4, int5));
        System.out.println(CalcMethods.divide(int6, int7));
        System.out.println(CalcMethods.divide2(int6, int8));

        System.out.println(CalcMethods.add(double1, double2));
        System.out.println(CalcMethods.multiply(double3, double4));
        System.out.println(CalcMethods.subtract(double5, double6));
        System.out.println(CalcMethods.divide(double7, double8));
    }



}
