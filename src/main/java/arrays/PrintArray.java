package arrays;

public class PrintArray {

    public static void main(String[] args) {

        int[] myIntArray = new int[25]; //{0, ... ,24};

//        myIntArray[0] = 0;
//        myIntArray[1] = 10;
//        myIntArray[2] = 20;
//        myIntArray[5] = 50;

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + i + ". Value: " + array[i]);
        }
    }
}
