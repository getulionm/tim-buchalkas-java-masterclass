package oopmasterchallenge;

public class Main {

    public static void main(String[] args) {

        BasicBurger myBurger = new BasicBurger("Bread", "Beef", 5.50);
        System.out.println(myBurger.extra("Cheese"));
        System.out.println(myBurger.extra("Tomato"));
        System.out.println(myBurger.getExtras());

    }
}
