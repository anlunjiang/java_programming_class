package challenges;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        char[] numArray = Integer.toString(number).toCharArray();
        int first = Integer.parseInt(String.valueOf(numArray[0]));
        int last = Integer.parseInt(String.valueOf(numArray[numArray.length - 1]));
        System.out.println(first);
        System.out.println(last);
        return first + last;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(42341253));
    }
}
