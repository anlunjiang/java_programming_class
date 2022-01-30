public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int xInt = (int) (x * 1000);
        int yInt = (int) (y * 1000);

        System.out.println(xInt);
        System.out.println(yInt);

        return (xInt == yInt);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
}
