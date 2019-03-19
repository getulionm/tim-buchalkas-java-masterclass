package composition.compositionchallenge;

public class Main {

    public static void main(String[] args) {

        Bed myBed = new Bed(2, "metal");
        Window myWindow = new Window(2);
        Table myTable = new Table(4, "wooden");

        Bedroom myBedroom = new Bedroom(myBed, myWindow, myTable);

        myBedroom.sleep(2);
        myBedroom.study("history");
        myBedroom.ventilate();

        myBedroom.ventilate();
        myBedroom.getTheTable().study("'How To Java'");
    }
}
