package challenges;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        // This is smart, damn!
        return number;
    }



    public static void main(String[] args) {
        System.out.println(getLargestPrime(26));
    }
}
