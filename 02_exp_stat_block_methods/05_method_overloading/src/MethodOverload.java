public class MethodOverload {
    /**
     * Method overloading allows us to create multiple methods of the same name with different implementations
     * The println method actually is an overloaded method for different dtypes
     */
    public static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %s points", playerName, score);
        return score * 1000;
    }
    // Method overloading means using the same method name but with different number of parameters
    public static int calculateScore(int score) {
        System.out.printf("Un-named player scored %s points", score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }
    public static void main(String[] args) {
        int newScore = calculateScore("Anlun", 10);
        System.out.println("\n" + newScore);
        // You can now call the second method by using the set number of parameters
        // Note Java keeps track of the datatype - not the param name - so only one calcScore
        // method of one param int type can exist
        int updatedScore = calculateScore(10);
        // You need to create a unique method signature (the method name and param datatype)]
        // The method signature DOES NOT change with return
        int zero = calculateScore();
    }
}
