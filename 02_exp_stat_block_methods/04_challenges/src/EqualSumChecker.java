public class EqualSumChecker {
    /**
     * @return True if the first and second param is equal to third else false
     */
    public static boolean hasEqualSum(int x, int y, int z) {
        int result = x + y;
        return (z == result);
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1, 2));
    }
}
