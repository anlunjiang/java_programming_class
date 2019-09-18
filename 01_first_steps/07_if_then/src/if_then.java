public class if_then {

    public static void main(String[] args) {

        boolean isAlien = true;

        if (isAlien == false) { // note, no semicolon afer if statement
            // !isAlien is a shortcut for saying isAlien!= True
            System.out.println("not an Alien");
            System.out.println("more than one line in the code block");
            // Always put a code block, otherwise only one line can be added
        } else {
            System.out.println("is an alien");
        }

        // Logical and && operator

        int topScore = 100;
        int greatScore = 75;
        int myScore = 1;

        if (myScore >= greatScore && myScore < topScore) {
            System.out.println("nice, you got a great score!");

        } else if (myScore <= greatScore) {
            System.out.println("try again later!");
        } else {
            System.out.println("nice job!! you got the highest score!");
        }

        if (myScore > 90 || myScore < 20) {
            System.out.println("good or bad job!");
        }

        // Ternary Operators

        boolean isCar = false;
        int wasCar = (isCar == true)? 1: 2;
        // wasCar depends on a condition, then assigns the value for true and false
        System.out.println(wasCar);

        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }


        // Challenge

        double x = 20.00d;
        double y = 80.00d;

        double remainder = ((x + y) * 100.00d) % 40.00d;
        System.out.println(remainder);

        boolean z = (remainder == 0)? true: false;
        System.out.println(z);

        if (!z) {
            System.out.println("Got some remainder");
        }
    }
}
