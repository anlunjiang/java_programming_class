package challenges;
import java.util.Arrays;

public class NumPalindrome {

    public static boolean isPalindrome(int number) {
        char[] numArray = Integer.toString(Math.abs(number)).toCharArray();
        char[] reverse = new StringBuilder(new String(numArray)).reverse().toString().toCharArray();
        System.out.println(numArray);
        System.out.println(reverse);
        return Arrays.equals(numArray, reverse);
    }

    public static void main(String[] args) {
        boolean ret = isPalindrome(-222);
        System.out.println(ret);
    }
}
