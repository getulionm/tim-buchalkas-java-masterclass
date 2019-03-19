package composition.compositionchallenge;

public class Bed {
    private int size;
    private String material;

    public Bed(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public void lay(int people) {
        if (people > 0 && people <= size) {
            System.out.println(people + " people laid on the bed now.");
        } else {
            System.out.println(people + " people won't fit on a bed made for " + size + " people.");
        }
    }

    public int getSize(){
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
