package Exercise_10;

public class MinutesToYearDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    // METHOD
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int year = (int) (minutes / (60 * 24 * 365));

            int remainingMinutes = (int) (minutes % (60 * 24 * 365));
            int day = remainingMinutes / (60 * 24);

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
