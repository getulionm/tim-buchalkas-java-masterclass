package composition.compositionchallenge;

public class Table {
    private int legs;
    private String material;

    public Table(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public void study(String subject){
        System.out.println("You are studying "+ subject +" at this " +material+" table now.");
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }
}
