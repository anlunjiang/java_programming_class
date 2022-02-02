public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerTemp = 25;
        int upperTemp = 35;

        if (summer) {
            upperTemp = 45;
        }

        return ((temperature >= lowerTemp) && (temperature <= upperTemp));
    }
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 45));
    }
}
