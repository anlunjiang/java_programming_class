package challenges;

import java.util.Scanner;

public class MinMax {

    public static void minMax() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // This is a good way to do this - using primitive dtype limitations
        // all ints will be between this range as defined by java lang

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input < min) {
                    min = input;
                }
                if (input > max) {
                    max = input;
                }
            } else {
                break;
            }
        }
        System.out.println("Min Num: " + min);
        System.out.println("Max Num: " + max);
        scanner.close();
    }

    public static void main(String[] args) {
        minMax();
    }
}
