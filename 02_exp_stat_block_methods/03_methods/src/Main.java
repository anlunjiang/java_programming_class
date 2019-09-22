import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What was your score?\n");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        boolean gameOver = true;

        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = calculateScore(score, levelCompleted, bonus);

            System.out.printf("\nOverall you completed %d Levels" +
                    "\nwith a bonus of %d per level" +
                    "\nTotal Score of %d", levelCompleted, bonus, finalScore);

        } else {
            System.out.println("The game has not finished yet");
        }

    }

    // New method outside of main method but in the class
    public static int calculateScore(int score, int levelCompleted, int bonus) {

        int finalScore = score + (levelCompleted * bonus);

        return finalScore;
    }
}
