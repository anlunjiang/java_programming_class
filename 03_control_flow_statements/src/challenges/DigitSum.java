package challenges;

public class DigitSum {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        char[] numAsStr = Integer.toString(number).toCharArray();
        int sum = 0;

        for (char i : numAsStr) {
            int c = Integer.parseInt(String.valueOf(i));
            sum += c;
        }
        return sum;
    }

    public static int sumDigitsMod(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.println(number);
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = sumDigits(234);
        System.out.println(sum);
        System.out.println(sumDigitsMod(23409));
    }
}
