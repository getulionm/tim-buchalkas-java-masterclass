package exceptions.catchblocks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 ** Exceptions are subclasses of the Exception class
 **
 ** public class Exception extends Throwable
 **
 ** Throwable constructor fills in the stack trace for the Exception
 ** - Line 864 (Scanner class) creates a new InputMismatchException object that contains the current stack trace
 **
 ** - Exception propagates the call stack and keeps getting passed to the calling
 **   method until there is one that actually can handle that exception
 */

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division.");
        }
    }

    private static int divide() {
        int x, y;
//        try {
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("No valid input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // go round again. Read past the end of line
                s.nextLine();
                System.out.println("Please enter a valid input (digits 0 to 9)");
            }
        }
    }
}
