package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;
    private boolean sprinkles;

    public IceCream(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = 32; //32 ounces in a tub.
    }

    public void addSprinkles() {
     sprinkles = true;
    }

    public void noSprinkles() {
        sprinkles = false;
    }

    public boolean hasSprinkles() {
        return sprinkles;
    }

    public void scoopIceCream(int scoops) {
        this.quantity -= scoops * 3; // 3 ounces of ice cream in a scoop.
        System.out.format("We have " + this.quantity + " ounces of " + flavor +" ice cream left.");
    }

    public double sell(int scoops) {
       this.price = price * scoops;
       System.out.println("Your total price is " + this.price + " dollars.");
       return price;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

}
