package com.company;

public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {
        if (monthNumber == 1) {
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        } else if (monthNumber == 8) {
            return "August";
        } else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12) {
            return "December";
        } else {
            return "Error: Invalid input";
        }

    }

    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            return "January";
        } else if (dayNumber == 2) {
            return "February";
        } else if (dayNumber == 3) {
            return "March";
        } else if (dayNumber == 4) {
            return "April";
        } else if (dayNumber == 5) {
            return "May";
        } else if (dayNumber == 6) {
            return "June";
        } else if (dayNumber == 7) {
            return "July";
        } else if (dayNumber == 8) {
            return "August";
        } else if (dayNumber == 9) {
            return "September";
        } else if (dayNumber == 10) {
            return "October";
        } else if (dayNumber == 11) {
            return "November";
        } else if (dayNumber == 12) {
            return "December";
        } else {
            return "Error: Invalid Input";
        }
    }
}

