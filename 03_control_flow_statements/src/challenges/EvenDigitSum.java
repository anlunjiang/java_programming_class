package challenges;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        char[] numArray = Integer.toString(number).toCharArray();
        for (char i:numArray) {
            int intChar = Integer.parseInt(String.valueOf(i));
            if (intChar % 2 == 0) {
                sum += intChar;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = getEvenDigitSum(124356);
        System.out.println(sum);
    }
}
