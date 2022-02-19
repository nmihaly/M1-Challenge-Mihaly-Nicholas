package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    // quantity in ounces
    private int quantity;

    public IceCream(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = 128;
    }

    public void refillQuantity(double amount) {
        this.quantity += amount;
    }

    public void scoop(int scoops) {
        this.quantity -= scoops * 10;
        System.out.format("Thanks that will be %f dollars!", price * scoops);
    }

    public void sample() {
        this.quantity--;
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
