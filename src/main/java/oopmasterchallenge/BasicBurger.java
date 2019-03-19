package oopmasterchallenge;

import java.util.ArrayList;

public class BasicBurger {
    private String roll;
    private String meat;
    private double price;
    private int addsOnLimit;
    private int currentAddOns;
    private ArrayList<String> extras;

    public BasicBurger(String roll, String meat, double price) {
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.addsOnLimit = 4;
        this.currentAddOns = 0;
        this.extras = new ArrayList<String>();
    }

    public String getRoll() {
        return roll;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public int getAddsOnLimit() {
        return addsOnLimit;
    }

    public int getAddOn() {
        return currentAddOns;
    }

    public int getCurrentAddOns() {
        return currentAddOns;
    }

    public ArrayList<String> getExtras() {
        return extras;
    }

    public String extra(String extra) {
        if (currentAddOns < addsOnLimit){
            this.currentAddOns += 1;
            this.price += 0.50;
            this.extras.add(extra);
            return "You have added "+extra+" to your burger for £0.50. \n Current total price: "+ getPrice() +
                    ".\nAdd ons: "+getAddOn()+" out of "+ getAddsOnLimit()+" possible.";
        } else {
            return "Current extras: "+ getExtras() + ". We can only add 4 add ons to this burger.";
        }
    }
}



