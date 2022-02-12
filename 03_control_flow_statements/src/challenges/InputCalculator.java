package challenges;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            sum += x;
            count += 1;
        }
        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
