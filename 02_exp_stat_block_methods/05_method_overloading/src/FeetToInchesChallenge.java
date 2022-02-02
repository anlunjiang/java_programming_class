public class FeetToInchesChallenge {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || !(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid");
            return -1;
        }
        double inchToCm = 2.54d;
        double feetCm = feet * 12 * inchToCm;
        double inchesCm = inches * inchToCm;

        double result = inchesCm + feetCm;
        System.out.println(result + "cm");
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            System.out.println("invalid");
            return -1;
        }

        int feet = inches / 12;
        int remInches = inches % 12;
        // You can call overloaded methods from overloaded methods
        return calcFeetAndInchesToCentimeters(feet, remInches);
    }


    public static void main(String[] args) {
        double ret = calcFeetAndInchesToCentimeters(13, 0);
        double ret1 = calcFeetAndInchesToCentimeters(157);
    }
}
