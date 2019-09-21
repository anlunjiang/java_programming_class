public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.printf("Your score was %d", score);
        } else if (score < 5000) {
            System.out.printf("Your score was %d", score);
        } else if (score > 5000) {
            System.out.printf("Your score was %d", score);
        } else {
            System.out.println("Not a number");
        }

        System.out.println("\nsecond if - then");

        if (gameOver) {
            score = 10000;
            System.out.println("\n" + score);
            int finalScore = score + (levelCompleted * bonus);
            System.out.printf("\nYour final score was %d", finalScore);
            // You can access global variable but finalScore cannot be accessed outside the codeblock
        }

        System.out.println("\n" + score);
        // Can't access new variables created in if statements but can access the updated values from them

    }
}
