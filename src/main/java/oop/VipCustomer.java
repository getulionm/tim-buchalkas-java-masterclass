package oop;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    public VipCustomer(){
        this("Default Name" , 100.0, "default@default.com");
        System.out.println("Hello, this is constructor. DEFAULT");
    }

    public VipCustomer(String name, String email){
        this(name, 100.0, email);
        this.name = name;
        this.email = email;
        System.out.println("Hello, this is constructor. 2 Parameters");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Hello, this is constructor. 3 Parameters");
    }

}
