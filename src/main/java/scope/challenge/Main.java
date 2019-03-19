package scope.challenge;

import java.util.Scanner;

public class Main {
    // Write a small program to read an integer from the keyboard (using Scanner)
    // and print out the times table for that number. Table should run from 1 to 12.
    //
    // You are allowed to use one variable called scanner for your Scanner instance.
    // You can use as many other variables as you need, but they must all be called x.
    // That includes any class instances and loop control variables that you may decide to use.
    //
    // If you use a class, the class can be called X, but any instances of it must be called x.
    //
    // Methods must also be called x.
    //
    // Optional extra:
    // Change your program so that ALL variables (including the scanner instance) are called x.

    public static void main(String[] args) {

        System.out.println("Type a number to get its times table (1-12):");

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
