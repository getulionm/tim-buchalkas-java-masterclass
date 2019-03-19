package composition.compositionchallenge;

public class Bedroom {
    private Bed theBed;
    private Window theWindow;
    private Table theTable;

    public Bedroom(Bed theBed, Window theWindow, Table theTable) {
        this.theBed = theBed;
        this.theWindow = theWindow;
        this.theTable = theTable;
    }

    public void sleep(int people){
        System.out.println(people + " people want to sleep on the bed...");
        theBed.lay(people);
    }

    public void study(String subject){
        System.out.println("You would like to study "+subject+" at the table...");
        theTable.study(subject);
    }

    public void ventilate(){
        System.out.println("You would like to ventilate the room...");
        theWindow.openWindow();
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Window getTheWindow() {
        return theWindow;
    }

    public Table getTheTable() {
        return theTable;
    }
}
