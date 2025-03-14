package org.example.models;

public class Hamburger {
    //instance variables:
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    //constructor:
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //getter methods:
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return price;
    }

    public double getPrice() {
        return price + addition1Price + addition2Price + addition3Price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    //methods:
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    //method: (to itemize)
    public double itemizeHamburger(){
        double total = getPrice();

        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);
        if (addition1Name != null) {
            System.out.println("Addition1: " + addition1Name);
            total += addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Addition2: " + addition2Name);
            total += addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Addition3: " + addition3Name);
            total += addition3Price;
        }
        System.out.println("Price: " + total);

        return total;
    }

}
