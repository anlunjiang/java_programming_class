public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {

        boolean minutesValidation = minutes >= 0;
        boolean secondsValidation = (seconds >= 0 && seconds <= 59);
        int hours;

        if (!minutesValidation || !secondsValidation) {
            return INVALID_VALUE_MESSAGE;
        }

        hours = (int) (minutes / 60);
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        boolean secondsValidation = (seconds >= 0);

        if (!secondsValidation) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = (int) (seconds / 60);
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
}
