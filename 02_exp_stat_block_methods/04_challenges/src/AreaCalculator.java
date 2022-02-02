import java.lang.Math;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
    public static void main(String[] args) {
        double ret = area(3);
        System.out.println(ret);

        double ret2 = area(12, 3);
        System.out.println(ret2);
    }
}
