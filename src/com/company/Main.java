package com.company;

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
        salsa.add("Mild");
        salsa.add("Medium");
        salsa.add("Hot");
        salsa.add("No Salsa");
        salsa.add("All the Salsa");

        //Veggie
        veggie.add("Lettuce");
        veggie.add("Fajita");
        veggie.add("Veggies");
        veggie.add("no Veggies");
        veggie.add("All the veggies");


        int ricebound = Rannum.nextInt(rice.size());
        int beanbound = Rannum.nextInt(beans.size());
        int meatbound = Rannum.nextInt(meat.size());
        int salsabound = Rannum.nextInt(salsa.size());
        int veggiebound = Rannum.nextInt(veggie.size());


        for (int i =1; i<=25; i++){
            for (int j = 0; j<=25;j++){
                ricebound = Rannum.nextInt(rice.size());
                beanbound = Rannum.nextInt(beans.size());
                meatbound = Rannum.nextInt(meat.size());
                salsabound = Rannum.nextInt(salsa.size());
                veggiebound = Rannum.nextInt(veggie.size());
            }
            //Is this completely random
            //System.out.println(ricebound + ", "+ beanbound+ ", "+ meatbound + ", "+ salsabound+ ", "+ veggiebound);
            System.out.println("Burrito " + i+ " : " + rice.get(ricebound)+", "+ beans.get(beanbound)+", "+ meat.get(meatbound) +", "+ salsa.get(salsabound)+", "+ veggie.get(veggiebound) );
        }


    }
}
