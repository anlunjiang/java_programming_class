package challenges;

import java.util.Scanner;

public class ReadUserInput {

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = 1;
        int retSum = 0;

        while (numOfInputs <= 10) {
            System.out.println("Enter number #" + numOfInputs);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                scanner.nextLine();
                numOfInputs++;
                retSum += input;
            } else {
                System.out.println("Invalid Number");
                scanner.close();
                break;
            }
        }
        scanner.close();

        System.out.printf("Total Sum: %d", retSum);
    }

    public static void main(String[] args) {
        readUserInput();
    }
}
