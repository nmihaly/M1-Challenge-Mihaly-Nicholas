package com.company.factory;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime; // in minutes
    private String[] ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }


    public int totalProductionTime(int gallons) {
        this.productionTime = productionTime * gallons;
        System.out.println("It will take " + this.productionTime + " minutes to make " + gallons + " gallons of " + flavor + " ice cream.");
        return productionTime;
    }

    public double totalSalePrice(int gallons) {
        this.salePrice = salePrice * gallons;
        System.out.println("It will cost " + this.salePrice + " dollars to buy " + gallons + " gallons of " + flavor + " ice cream.");
        return salePrice;
    }

    public double productionCostPerMinute() {
        this.salePrice = salePrice/productionTime;
        System.out.println("It will cost " + this.salePrice + " dollars per minute to make a gallon of " + flavor + " ice cream.");
        return salePrice;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
