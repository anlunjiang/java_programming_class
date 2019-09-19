import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
	// Expressions are building blocks of all java programmes
        System.out.println("Enter a length in Kilometers\n");
        Scanner x = new Scanner(System.in);
        double kilom = x.nextDouble();
        double miles = kilom / 1.60934d;

        String kilomtype = ((Object) kilom).getClass().getSimpleName();
        String miletype = ((Object) miles).getClass().getSimpleName();
        System.out.printf("kilom type: %s\nmiles type: %s\n", kilomtype, miletype);
        // getClass() and getName usually only works on non primitive types - so you
        // cast them as an object first before calling the method


        String str = String.format("%s Kilometers is equal to %s Miles", df.format(kilom), df.format(miles));
        // note not %d as that is a decimal integer
        System.out.println(str);

    }
}
