package Static;

public class StaticTest {
    // static keyword associates the field to the class and not to its instances
    private static int numInstances = 0;

    private String name;


    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
