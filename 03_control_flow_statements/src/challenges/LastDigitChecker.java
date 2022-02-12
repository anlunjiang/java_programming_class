package challenges;

public class LastDigitChecker {

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!(isValid(x) && isValid(y) && isValid(z))) {
            return false;
        }
        int charX = x % 10;
        int charY = y % 10;
        int charZ = z % 10;
        return (charX == charY) || charX == charZ || charY == charZ;
    }

    public static void main(String[] args) {
        boolean ret = hasSameLastDigit(11, 34, 64);
        System.out.println(ret);
    }
}
