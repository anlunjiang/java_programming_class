public class BarkingDog {
    /**
     * Method that returns whether wakeup should be triggered Return true if dog barking 22-8 hours
     * else false
     *
     * @param barking
     */
    public static boolean shouldWakeUp(boolean barking, int hour) {
        if ((!barking) || (hour < 0 || hour > 23)) {
            return false;
        }
        return hour < 8 || hour > 22;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }
}
