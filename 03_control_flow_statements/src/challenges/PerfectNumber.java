package challenges;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumOfDivisors = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return (sumOfDivisors == number);
    }

    public static void main(String[] args) {
        boolean ret = isPerfectNumber(28);
        System.out.println(ret);
    }
}
