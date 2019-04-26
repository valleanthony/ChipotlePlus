package com.company;

public class Chip {
    String Rice;
    String Beans;
    String Meat;
    String Salsa;
    String Veggies;
    String Cheese;
    String Guac;
    String SourCream;

    double basePrice = 3.00;
    double addOn = .50;
    double PriceofChip;

    public String getRice() {
        return Rice;
    }

    public void setRice(String rice) {
        Rice = rice;
    }

    public String getBeans() {
        return Beans;
    }

    public void setBeans(String beans) {
        Beans = beans;
    }

    public String getMeat() {
        return Meat;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public String getSalsa() {
        return Salsa;
    }

    public void setSalsa(String salsa) {
        Salsa = salsa;
    }

    public String getVeggies() {
        return Veggies;
    }

    public void setVeggies(String veggies) {
        Veggies = veggies;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public String getGuac() {
        return Guac;
    }

    public void setGuac(String guac) {
        Guac = guac;
    }

    public String getSourCream() {
        return SourCream;
    }

    public void setSourCream(String sourCream) {
        SourCream = sourCream;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getAddOn() {
        return addOn;
    }

    public void setAddOn(double addOn) {
        this.addOn = addOn;
    }

    public void setPriceofChip(double priceofChip) {
        PriceofChip = priceofChip;
    }

    public Chip() {
    }

    public Chip(String rice, String beans, String meat, String salsa, String veggies, String cheese, String guac, String sourCream) {
        Rice = rice;
        Beans = beans;
        Meat = meat;
        Salsa = salsa;
        Veggies = veggies;
        Cheese = cheese;
        Guac = guac;
        SourCream = sourCream;
    }


    public double getPriceofChip(){

     PriceofChip = basePrice+ addOn

     return.PriceofChip;
 }


    public String construct(){
        return ;
    }

}



