package interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;

        System.out.println("\n-> ITelephone timsPhone = new DeskPhone\n");
        timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println("\n-> ITelephone timsPhone = new MobilePhone\n");

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
