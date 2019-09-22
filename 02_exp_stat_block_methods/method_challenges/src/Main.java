import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.next();

        System.out.println("Enter your score");
        Scanner inputScore = new Scanner(System.in);
        int score = inputScore.nextInt();

        displayHighScorePosition(name, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String player, int position) {
        // Procedure - method that doesnt return anything
        System.out.printf("%s managed to get into position %d on the high score table",
                player, position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        //Method / Function that returns stuff

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore > 100) {
            position = 3;
        }

        return position;
    }
}
