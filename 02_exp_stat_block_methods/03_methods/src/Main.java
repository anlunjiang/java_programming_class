import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	double x = 100.34;
    	rounded = Math.round(x);
    	// rounded is rounded to the nearest int

        System.out.println("What was your score?\n");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        boolean gameOver = false;

        int levelCompleted = 5;
        int bonus = 100;

        if (score > 0) {
            int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
            System.out.printf("\nOverall you completed %d Levels" +
                    "\nwith a bonus of %d per level" +
                    "\nTotal Score of %d", levelCompleted, bonus, finalScore);
        } else {
            System.out.println("You have not entered a valid score, exiting");
            System.exit(0);
        }

    }

    // New method outside of main method but in the class
    public static int calculateScore(boolean gameOver, int score,
                                     int levelCompleted, int bonus) {
        if (gameOver) {
            return score + (levelCompleted * bonus);
        } else {
            System.out.println("The game has not finished yet");
            System.exit(0);
            return -1;
        }

    }
}
