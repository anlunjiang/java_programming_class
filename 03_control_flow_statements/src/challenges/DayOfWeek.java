package challenges;

import java.util.HashMap;
import java.util.Map;

public class DayOfWeek {
    public static void printDayOfWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Not Found");
        }
    }

    public static void printDayOfWeekForLoop(int day) {
        Map<Integer, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put(0, "Sunday");
        daysOfWeek.put(1, "Monday");
        daysOfWeek.put(2, "Tuesday");
        daysOfWeek.put(3, "Wednesday");
        daysOfWeek.put(4, "Thursday");
        daysOfWeek.put(5, "Friday");
        daysOfWeek.put(6, "Saturday");

        System.out.println(daysOfWeek.getOrDefault(day, "Not Found"));
        // This is like the python syntax! - normal get doesnt have this
    }

    public static void main(String[] args) {
        printDayOfWeek(12);
        printDayOfWeekForLoop(9);
    }
}
