import java.util.Scanner;

public class _05ReadingUserInput {
    public static void main(String[] args) {

        // Like input() in python - scanner allows us to read user input
        Scanner scanner = new Scanner(System.in);
        // It's a class, so we need to first create an instance of the Scanner class
        String myInt = scanner.next();

        System.out.println(myInt);
    }
}
