public class _02ForStatement {

    public static double calculateInterest(double amount, double interestRate) {
        double ret =  (amount * (interestRate / 100));
        System.out.printf("%.2f%n", ret);
        return ret;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            System.out.printf("%d not Prime, ", n);
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.printf("%d not Prime, ", n);
                return false;
            }
        }
        System.out.printf("%d Prime, ", n);
        return true;
    }

    public static void testPrime(int start, int end) {

        int numOfPrime = 0;
        for (int i = start; i <= end; i++) {
            if (numOfPrime < 7) {
                if (isPrime(i)) {
                    numOfPrime += 1;
                }
                System.out.printf("Number of Prime numbers: %d \n", numOfPrime);
            } else {
                System.out.println("Max number of prime numbers found");
                break;
            }
        }
    }

    public static void main(String[] args) {
        double latest = 0;

        // This is for loops like in python range() - not for iterating through an iterable
        // init; terminate; incrememt

        // for iterating through arrays etc you need the forEach method

        for (int i = 2; i <= 8; i++) {
            latest = calculateInterest(50, i);
        }

        System.out.printf("%s is the latest rate\n", String.format("%.2f", latest));

        testPrime(1, 50);
    }
}
