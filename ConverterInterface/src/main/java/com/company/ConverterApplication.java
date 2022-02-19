package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter convertIf = new ConverterIf();
        Converter convertSwitch = new ConverterSwitch();

        System.out.format("The 4th month of the year is %s%n", convertIf.convertMonth(4));
        System.out.format("The 2nd day of the month is %s%n", convertSwitch.convertDay(2));
    }



}
