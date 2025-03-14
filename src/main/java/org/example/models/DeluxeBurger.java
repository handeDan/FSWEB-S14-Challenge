package org.example.models;

public class DeluxeBurger extends Hamburger{
    //instance variables:
    private final String chips;
    private final String drink;

    //constructor:
    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.chips = "CURVY";
        this.drink = "COKE";
    }

    //getter methods:
    public String getDrink() {
        return drink;
    }

    public String getCips() {
        return chips;
    }

    //override methods:
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }


}
