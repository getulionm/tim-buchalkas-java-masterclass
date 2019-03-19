package abstraction;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "penguin";
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("But a "+ this.toString() + " can't really fly...");
    }
}
