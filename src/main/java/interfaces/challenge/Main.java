package interfaces.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Create a simple interface that allows an object to be saved to some sort of storage medium.
    // The exact type of medium in now known to the interface (nor to the classes that implement it).
    // The interface will just specify 2 methods, 1 no return an ArrayList of the values to be saved
    // and 1 to populate the object's fields from an ArrayList.
    //
    // Create some sample classes that implement tour saveable interface.
    //
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    //
    // In Main, write a method that takes an object that implement the interface as a parameter and "saves" the values.
    // We haven't covered I/O yet, so your method should just print the values to the screen.
    // Also in Main, write a method that restores the values to a saveable object.
    // Again, we are not going to use Hava file I/O; instead, use the readValues() method below to simulate getting
    // values from a faile - this allows you to type as many values as your class requires, and returns an ArrayList.

        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer Sword");
        saveObject(tim);
//        loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Monster's strength = " + ((Monster) werewolf).getStrenght());

        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+"1 to enter a string\n"+"0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
