public class YearAndDay {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int minutesToYear = 525600;
            int minutesToDay = 1440;

            int years;
            int days;
            // Variables declared inside a conditional cannot be accessed outside the scope

            if (minutes >= minutesToYear) {
                years = (int) (minutes / minutesToYear);
                days = (int) ((minutes - (minutesToYear * years)) / minutesToDay);
            } else {
                years = 0;
                days = (int) (minutes / minutesToDay);
            }

            System.out.printf("%d min = %d y and %d d", minutes, years, days);
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(15600000);
    }
}
