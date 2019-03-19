package loops;

public class Switch {

    public static void main(String[] args) {

        char switchValue = 'D';

        switch(switchValue) {
            case 'A':
                System.out.println("value is A");
                break;
            case 'B':
                System.out.println("value is B");
                break;
            case 'C':
                System.out.println("value is C");
                break;
            case 'D':
                System.out.println("value is D");
                break;
            case 'E':
                System.out.println("value is E");
                break;

            default:
                System.out.println("value not found");
                break;

        }
    }
}
