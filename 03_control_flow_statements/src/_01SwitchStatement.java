import java.util.Locale;
import java.util.Scanner;

public class _01SwitchStatement {
    /**
     * Switch statements are like if else conditionals
     * The break keyword breaks out the switch statement - if break is not included
     * it will go through to the next switch logic regardless if it's valid!
     *
     * It can be used only with primitive dtypes but also String after Java 7
     *
     * Switch and if else do the same thing - but switch can only test te switch value - not
     * any other variable
     *
     * Personally - I'd just stick with if else!
     */
    public static void switchStatement() {
        Scanner input = new Scanner(System.in);
        int switchValue = input.nextInt();
         switch(switchValue) {
             case 1:
                System.out.println("Value was 1");
                break;
             case 2:
                System.out.println("Value was 2");
                break;
             case 3: case 4: case 5:
                System.out.println("3, 4, or 5 was entered");
                break;
             default:
                System.out.println("Was not 1 or 2");
                break;
        }
        System.out.println("Outside");
    }

    public static void switchChallenge() {
        String switchValue = "January";

        // String values have built in methods for lower and upper case
        switch (switchValue.toLowerCase()) {
            case "january":
                System.out.println("Found Jan");
                break;
            case "june":
                System.out.println("Found June");
                break;
            case "march":
                System.out.println("Found March");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
    public static void main(String[] args) {
        switchStatement();

        switchChallenge();
    }
}
