package composition.compositionchallenge;

public class Window {
    private int pannels;
    public boolean isItOpen;

    public Window(int pannels) {
        this.pannels = pannels;
        this.isItOpen = false;
    }

    public void openWindow(){
        if (isItOpen){
            System.out.println("Windows is already open.");
        } else {
            isItOpen = true;
            System.out.println("You opened the window.");
        }
    }

    public boolean isItOpen() {
        return isItOpen;
    }

    public void setItOpen(boolean itOpen) {
        isItOpen = itOpen;
    }
}
