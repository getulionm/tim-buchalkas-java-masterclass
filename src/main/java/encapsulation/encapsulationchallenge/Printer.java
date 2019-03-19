package encapsulation.encapsulationchallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void fillUp(int ink){
        System.out.println("Filling up the toner...");
        tonerLevel += ink;
        System.out.println("Toner now at "+ tonerLevel + "%.");
        if (tonerLevel > 100){
            System.out.println("Toner full.");
            tonerLevel = 100;
        }
    }

    public void print(int pages){
        System.out.println("Printing "+ pages + " page(s)...");
        pagesPrinted += pages;
        tonerLevel -= pages;
        System.out.println("Toner now at "+ tonerLevel + "%.");
    }

    public int getTonerLevel() {
        System.out.println("Toner now at "+ tonerLevel + "%.");
        return tonerLevel;
    }

    public int getPagesPrinted() {
        System.out.println("Pages printed: "+ pagesPrinted);
        return pagesPrinted;
    }
}
