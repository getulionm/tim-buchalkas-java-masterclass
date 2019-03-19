package polymorphism.polymorphismchallenge;


class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String startEngine(boolean eng){
        if(eng){
            return "CAR -> Engine is already on";
        }else{
            this.engine = true;
            return "CAR -> You turned the engine on";
        }
    }

    public String accelerate(){
        return "CAR - ACCELERATE";
    }

    public String brake(){
        return "CAR -> BRAKE";
    }
}

class Tesla extends Car{
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String accelerate() {
        return "TESLA -> ACCELERATE";
    }

    @Override
    public String startEngine(boolean eng) {
        System.out.println("TESLA -> START ENGINE");
        return super.startEngine(eng);
    }

    @Override
    public String brake() {
        return "TESLA -> BRAKE";
    }
}

class Roadster extends Car{
    public Roadster(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String accelerate() {
        return "ROADSTER -> ACCELERATE";
    }
    @Override
    public String startEngine(boolean eng) {
        System.out.println("ROADSTER -> START ENGINE");
        return super.startEngine(eng);
    }

    @Override
    public String brake() {
        return "ROADSTER -> BRAKE";
    }
}

class Superfast extends Car{
    public Superfast(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String accelerate() {
        return "SUPERFAST -> ACCELERATE";
    }
    @Override
    public String startEngine(boolean eng) {
        System.out.println("SUPERFAST -> START ENGINE");
        return super.startEngine(eng);
    }

    @Override
    public String brake() {
        return "SUPERFAST -> BRAKE";
    }
}

public class Main {

    public static void main(String[] args) {

        Car tesla = new Tesla("Tesla S", 8);
        Car roadster = new Roadster("Roadster", 16);
        Car Superfast = new Superfast("Superfast", 32);

        System.out.println(tesla.startEngine(true));
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());
        System.out.println("************************");
        System.out.println(roadster.startEngine(false));
        System.out.println(roadster.accelerate());
        System.out.println(roadster.brake());
        System.out.println("************************");
        System.out.println(Superfast.startEngine(true));
        System.out.println(Superfast.accelerate());
        System.out.println(Superfast.brake());



    }
}


