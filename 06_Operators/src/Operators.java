public class Operators {

    public static void main(String[] args) {
        // Operators perform operations - addition e.g.
        // An operand is the object being manipulated by the operator
        int x = 4 + 4; // equals is an assignment operator
        System.out.printf("4 + 4 = %d", x);

        x = x % 3;
        System.out.println("\n" + x);
        x ++; // x = x + 1
        System.out.println("\n" + x);
        x --; // x = x - 1
        System.out.println("\n" + x);
        x += 2; //x = x + 2
        System.out.println("\n" + x);
        // Can use for other operations *=, +=, -= etc
    }
}
