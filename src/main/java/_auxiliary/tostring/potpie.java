package _auxiliary.tostring;

public class potpie {
    private int month;
    private int day;
    private int year;

    public potpie(int m, int d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;

        // "this" references to the object and returns toString method when constructor is called
        System.out.printf("Constructor is %s\n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }

}
