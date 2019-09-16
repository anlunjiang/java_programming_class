import java.util.Scanner;
import java.text.DecimalFormat;

public class floatDouble {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {


        int xInt = 5 / 2;
        float xFloat = 5f / 3f;
        // like long dataType, it is good practice to put f after a float
        double xDouble = 5d / 3d;
        // any number with a decimal point java assumes is double (twice the precision)
        System.out.print("xInt = " + xInt);
        System.out.print("\nxFloat = " + xFloat);
        System.out.print("\nxDouble = " + xDouble + "\n");
        // Double data type is actually faster in most machines

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // Notes 1 pounds is equal to 0.45359237 kilograms

        Scanner input = new Scanner(System.in);
        // new creates a new object
        System.out.println("Enter a weight in pounds");

        double constant = 0.45359237d;
        double inputPounds = input.nextDouble();
        double kilos = inputPounds * constant;

        System.out.println("Weight of " + df.format(inputPounds) + " Pounds");
        System.out.println("is equal to " +  df.format(kilos) + " Kilograms");

        // Scanner is the class that we take an instance of to produce a user input
        // to round, we need to import BigDecimal or DecimalFormat

    }
}
