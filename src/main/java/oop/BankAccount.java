package oop;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constructor calling another constructor using this()
    public BankAccount(){
        this("56789", 2.50, "Default name",
                "Defauld address", "Default phone");
        System.out.println("Hello. This is constructor.");
    }

    // constructor with ALL parameters
    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("BankAccount for "+this.customerName+" constructed with parameters");
    }

    // constructor with 3 parameters
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 10.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("Amount deposited. Balance is now: "+ balance);
    }
    public void withdrawn(double withdrawalAmount){
        if(withdrawalAmount > balance){
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else {
            balance -= withdrawalAmount;
            System.out.println("Amount withdrawn. Balance is now: "+ balance);
        }
    }

}
