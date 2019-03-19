package encapsulation.encapsulationchallenge;

public class Main {

    public static void main(String[] args) {

        Printer thePrinter = new Printer(50, 0, true);

        thePrinter.print(10);

        thePrinter.getTonerLevel();

        thePrinter.fillUp(100);

        thePrinter.getPagesPrinted();

        thePrinter.print(80);

        thePrinter.getPagesPrinted();
    }
}
