package com.company;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Making ran numbers
        Random Rannum = new Random();

	//making five arrays to store the ingredients.
        ArrayList<String> rice = new ArrayList<>();
        ArrayList<String> beans = new ArrayList<>();
        ArrayList<String> meat = new ArrayList<>();
        ArrayList<String> salsa = new ArrayList<>();
        ArrayList<String> veggie = new ArrayList<>();
        ArrayList<String> cheese = new ArrayList<>();
        ArrayList<String> guac = new ArrayList<>();
        ArrayList<String> queso = new ArrayList<>();
        ArrayList<String> sourcream = new ArrayList<>();
        ArrayList<Object> chipbowl = new ArrayList<>();


        //Adding types to each array
        //Rice first (Ran bound is 2)
        rice.add("White");
        rice.add("Brown");
        rice.add("No Rice");


        //Beans (ran bound is 2)
        beans.add("Pinto");
        beans.add("Black");
        beans.add("No Beans");

        //Meat  (Ran bound is 5 )
        meat.add("Chicken");
        meat.add("Steak");
        meat.add("Carnitas");
        meat.add("Chorizo");
        meat.add("Sofritas");
        meat.add("Veggies");

        //Salsa
        salsa.add("Mild Salsa");
        salsa.add("Medium Salsa");
        salsa.add("Hot Salsa");
        salsa.add("No Salsa");
        salsa.add("All the Salsa");

        //Veggie
        veggie.add("Lettuce");
        veggie.add("Fajita");
        veggie.add("Veggies");
        veggie.add("no Veggies");
        veggie.add("All the veggies");

        //Cheese
        cheese.add("Cheese");
        cheese.add("No Cheese");

        //Guac
        guac.add("Guac");
        guac.add("No Guac");

        //Queso
        queso.add("Queso");
        queso.add("No Queso");

        //Sour Cream
        sourcream.add("Sour Cream");
        sourcream.add("No Sour Cream");


        int ricebound = Rannum.nextInt(rice.size());
        int beanbound = Rannum.nextInt(beans.size());
        int meatbound = Rannum.nextInt(meat.size());
        int salsabound = Rannum.nextInt(salsa.size());
        int veggiebound = Rannum.nextInt(veggie.size());
        int cheesebound = Rannum.nextInt(cheese.size());
        int guacbound =Rannum.nextInt(guac.size());
        int sourcreambound = Rannum.nextInt(sourcream.size());

        String RiceO;
        String BeansO;
        String MeatO;
        String SalsaO;
        String VeggieO;
        String CheeseO;
        String GuacO;
        String SourcreamO;

        Double price=0.00;
        Double base = 7.00;

        for (int i =1; i<=25; i++){
            for (int j = 0; j<=25;j++){
                ricebound = Rannum.nextInt(rice.size());
                beanbound = Rannum.nextInt(beans.size());
                meatbound = Rannum.nextInt(meat.size());
                salsabound = Rannum.nextInt(salsa.size());
                veggiebound = Rannum.nextInt(veggie.size());
                cheesebound = Rannum.nextInt(cheese.size());
                guacbound =Rannum.nextInt(guac.size());
                sourcreambound = Rannum.nextInt(sourcream.size());
            }
            //Is this completely random
            //System.out.println(ricebound + ", "+ beanbound+ ", "+ meatbound + ", "+ salsabound+ ", "+ veggiebound);
            RiceO = rice.get(ricebound); // Creating variables to test
            BeansO = beans.get(beanbound);
            MeatO = meat.get(meatbound);
            SalsaO = salsa.get(salsabound);
            VeggieO = veggie.get(veggiebound);
            CheeseO = cheese.get(cheesebound);
            GuacO = guac.get(guacbound);
            SourcreamO = sourcream.get(sourcreambound);
            Chip ch = new Chip(RiceO,BeansO,MeatO,SalsaO,VeggieO,CheeseO,GuacO,SourcreamO); // This is creating a new instance of the class Chip
            chipbowl.add(ch); // This is adding the instance above to the array list

            System.out.println("Burrito " + i+ " : " + rice.get(ricebound)+", "+ beans.get(beanbound)+", "+ meat.get(meatbound) +", "+ salsa.get(salsabound)+", "
                    + veggie.get(veggiebound)+", "+ cheese.get(cheesebound) +", "+guac.get(guacbound) +", "+ sourcream.get(sourcreambound) +" The Price is: $"+ Chip);

        }






    }
}
