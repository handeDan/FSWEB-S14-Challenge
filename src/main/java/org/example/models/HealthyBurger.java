package org.example.models;

public class HealthyBurger extends Hamburger{
    //instance variables:
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    //constructor:
    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    @Override
    public double getPrice() {
        return  getBasePrice()+ healthyExtra1Price + healthyExtra2Price;
    }

    //methods:
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //override methods:
    @Override
    public double itemizeHamburger(){
        double total = super.getPrice() + healthyExtra1Price + healthyExtra2Price;

        if(healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + healthyExtra1Name);
            total += healthyExtra1Price;
        }

        if(healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + healthyExtra2Name);
            total += healthyExtra2Price;
        }

        System.out.println("Price: " + total);

        return total;
    }
}
