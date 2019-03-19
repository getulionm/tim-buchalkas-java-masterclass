package loops.enhanced;


// Telusko
public class Main {

    public static void main(String[] args) {

//        int a[] = {1, 2, 3, 4};
//
//        for(int k : a){
//            System.out.println(k);
//        }

        int two2[][] = {
                {1, 2, 3, 4},      // Jagged Array
                {2, 4, 8},
                {5, 6, 7, 8, 9}
        };

        for (int k[] : two2) {
            for (int l : k) {
                System.out.println(" " + l);
            }
            System.out.println();
        }

    }
}
