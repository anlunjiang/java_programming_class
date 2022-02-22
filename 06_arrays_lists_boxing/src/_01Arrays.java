import java.util.Arrays;
import java.util.Scanner;

public class _01Arrays {
    private static final Scanner scanner = new Scanner(System.in);
    // ARRAYS are mutable - BUT the size is NOT - therefore you can replace but not apoend!
    public static void main(String[] args) {
        // To create an Array of a type is easy - same as normal but with []
        int[] myIntArray =
                new int[10]; // this assigns space for 10 ints to this variable with default 0!
        // For boolean arrays default is false
        myIntArray[0] = 30; // this assigns the zero'th element to 30
        System.out.println(Arrays.toString(myIntArray));
        // For arrays it's simple to retrieve by slicing by index
        System.out.println(myIntArray[0]);
        // You can assign values on the fly like in python:
        // This creates the array of size 5 only
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        // to see how long an array is:
        System.out.println(intArray.length);
        sumAvgArray();
    }

    public static void sumAvgArray() {
        int[] myArray = getIntegers(5);
        double avg = Arrays.stream(myArray).average().orElse(Double.NaN);
        // You can stream arrays (more on this later to get sum or average easily)
        System.out.println(avg);
    }

    public static int[] getIntegers(int arrLen) {
        System.out.println("Enter " + arrLen + " Integer values.\r");
        int[] values = new int[arrLen];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
