package challenges;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        char[] charArrayX = Integer.toString(x).toCharArray();
        char[] charArrayY = Integer.toString(y).toCharArray();

        for (char i : charArrayX) {
            for (char j : charArrayY) {
                if (i == j) {
                    return true;
                }
            }
        }
        // good example of for-loop but in practice ofc this is O[n^2] which is bad
        // use map!

        return false;
    }

    public static void main(String[] args) {
        boolean ret = hasSharedDigit(15, 67);
        System.out.println(ret);
    }
}
