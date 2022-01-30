public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z) {
        return (isTeen(x) || isTeen(y) || isTeen(z));
    }

    public static boolean isTeen(int a) {
        return (a >= 13 && a <= 19);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(1, 2, 13));
    }
}
