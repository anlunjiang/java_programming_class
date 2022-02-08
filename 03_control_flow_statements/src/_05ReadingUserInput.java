import java.util.Scanner;

public class _05ReadingUserInput {
    public static void main(String[] args) {

        // Like input() in python - scanner allows us to read user input
        Scanner scanner = new Scanner(System.in);
        // It's a class, so we need to first create an instance of the Scanner class
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        // This is great for assertions! This checks to see if the next input is an INT!

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // casted input into int type
            // NOTE: Whenever we enter a number into the scanner - int/double/float etc
            // and press the enter key - we end the line
            // Scanner is searching for a line separator - and when you press enter than gets fed
            // into the next scanner input
            scanner.nextLine(); // which is why you need an extra scanner - noted as a consumer string

            System.out.println("Enter your favourite food: ");
            String favFood = scanner.nextLine();

            // It's greatly recommended closing the scanner once done with it
            // This releases the underlying memory that scanner was using
            scanner.close();

            int age = 2022 - yearOfBirth;

            System.out.printf(
                    "Hello %s, you are %d years old - your food is %s", name, age, favFood);
        } else {
            System.out.println("Wrong datatype for age - expecting int");
        }

        // You need the consumer nextLine because - scanner takes everything before the \n as the
        // line
        // for strings - but for ints - it just looks for numbers - and ignores the \n - the next
        // scanner
        // will then see the remaining \n and take all that's before - which is now nothing!
    }
}
