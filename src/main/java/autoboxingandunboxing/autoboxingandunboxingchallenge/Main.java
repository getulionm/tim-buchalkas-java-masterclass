package autoboxingandunboxing.autoboxingandunboxingchallenge;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Barclays");
        bank.addBranch("London");
        bank.addCustomer("London", "Getulio", 10.00);
        bank.addCustomer("London", "Josi", 400.50);
        bank.addCustomer("London", "Bill", 2.90);

        bank.addBranch("Hove");
        bank.addCustomer("Hove", "Sarah", 300.00);
        bank.addCustomer("Hove", "Terence", 60.40);

        bank.addCustomerTransaction("London", "Getulio", 15.15);
        bank.addCustomerTransaction("London", "Getulio", 50.80);
        bank.addCustomerTransaction("London", "Josi", 1.99);

        bank.listCustomers("London", false);
        System.out.println();
        bank.listCustomers("Hove", false);

        if (!bank.addCustomerTransaction("London", "Fergus", 321.00)) {
            System.out.println("No customer named Fergus");
        }

        bank.addCustomer("London", "Getulio", 12.12);
        bank.addCustomerTransaction("London", "Getulio", 15.15);
        bank.addCustomerTransaction("London", "Getulio", 50.80);
        bank.addCustomerTransaction("London", "Getulio", 15.15);
        bank.addCustomerTransaction("London", "Getulio", 50.80);
        bank.addCustomerTransaction("London", "Getulio", 15.15);
        bank.addCustomerTransaction("London", "Getulio", 50.80);

        bank.listCustomers("London", true);

    }
}
