package challenges;

public class NumberToWords {

    public static void numberToWords(int number) {
        int reverse = reverse(number);
        String[] array = {
            "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
        };
        if (reverse < 0) {
            System.out.println("Invalid Value");
        } else {
            while (reverse != 0) {
                int lastDigit = reverse % 10;
                System.out.println(array[lastDigit]);
                reverse /= 10;
            }
            for (int i = 0; i <= (getDigitCount(number) - getDigitCount(reverse)); i++ ) {
                System.out.println("ZERO");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return Integer.toString(number).length();
    }
    public static void main(String[] args) {
        numberToWords(10);
    }
}
