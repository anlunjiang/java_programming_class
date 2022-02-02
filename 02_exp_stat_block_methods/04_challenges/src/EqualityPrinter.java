public class EqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";
    private static final String NUMS_EQUAL = "All numbers are equal";
    private static final String NUMS_DIFFERENT = "All numbers are different";
    private static final String NEITHER = "Neither all are equal or different";


    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_VALUE);
        } else if (x == y && y == z) {
            System.out.println(NUMS_EQUAL);
        } else if (x != y && y != z && x != z) {
            System.out.println(NUMS_DIFFERENT);
        } else {
            System.out.println(NEITHER);
        }
    }

    public static void main(String[] args) {
        printEqual(1, 2, -23);
    }
}
