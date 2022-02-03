public class _03WhileDoStatements {
    // while loops

    public static void whileLoops() {
        int count = 0;
        while (count <= 5) {
            System.out.println("Value is: " + count);
            count++;
        }

        count = 1;

        while (true) {
            if (count == 5) {
                System.out.println("While loops can use true as well");
                break;
            }
            count++;
        }
    }

    public static void doWhileLoops() {
        // Do while loops will always execute at least once
        // if you set count to 8 for example - the print
        // will still work! at least once
        int count = 8;
        do {
            System.out.println("Count value was: " + count);
            count++;
            if (count > 4) {
                break;
            }
        } while (count <= 200);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        whileLoops();
        doWhileLoops();

        int number = 0;
        int numEven = 0;
        while (number < 20) {
            if (numEven == 5) {
                break;
            }
            number ++;
            if (!isEvenNumber(number)) {
                continue;
            } // continue - like in python bypasses anything after the word `continue`
            System.out.println("Even Number: " + number);
            numEven += 1;
        }
        System.out.println("Total number of even numbers: " + numEven);
    }
}
