package loops;

public class For {

    public static void main(String[] args) {
//        System.out.println("10.000 at 2% interest = "+calculateInterest(10000.0, 2.0));
//        System.out.println("10.000 at 3% interest = "+calculateInterest(10000.0, 3.0));
//        System.out.println("10.000 at 4% interest = "+calculateInterest(10000.0, 4.0));
//        System.out.println("10.000 at 5% interest = "+calculateInterest(10000.0, 5.0));

    int primeNumbersFound = 0;
        for (int i = 1; i<=30; i++){
            if(isPrime(i)) {
                primeNumbersFound++;
                System.out.println("It is "+isPrime(i)+" that number "+i+" is prime.");
            }
            if (primeNumbersFound == 3){
                System.out.println(primeNumbersFound);
                break;
            }
        }

    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i<= (long) Math.sqrt(n); i++){
            System.out.println("Looping "+i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));

    }
}
