package challenges;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SortedArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int x) {
        System.out.println("Enter " + x + " numbers:\r");
        int[] intArr = new int[x];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }
        scanner.close();
        return intArr;
    }

    public static void printArray(int[] intArray) {
        for (int i=0; i<intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArr) {
        Arrays.sort(unsortedArr);
        return IntStream.range(0, unsortedArr.length).map(i -> unsortedArr[unsortedArr.length - i - 1]).toArray();
        // Really nice way to reverse primitive int arrays!

    }

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(3)));
    }
}
