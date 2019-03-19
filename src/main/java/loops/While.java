package loops;

public class While {

    public static void main(String[] args) {

//        int count = 6;
//
//        while(count!= 6){
//            System.out.println("Count is "+count);
//            count++;
//        }
//
//        for (int i=6; i!=6; i++){
//            System.out.println("Count is "+ count);
//        }
//
//        do{
//            System.out.println("Count is "+ count);
//            count++;
//            if(count > 100){
//                break;
//            }
//        } while (count != 6);

        System.out.println("*******************************************");

//        count = 1;
//        while(true){
//            if(count==5){
//                break;
//            }
//            System.out.println("Count is "+count);
//            count++;
//
//        }


        int number = 5;
        int finishNumber = 50;
        int evens = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number "+ number);
            evens++;
            number++;

            if(evens == 5) {
                break;
            }
            }
        System.out.println("# of evens found: "+ evens);
        }


    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

}
