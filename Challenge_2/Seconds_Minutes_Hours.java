package Challenge_2;

public class Seconds_Minutes_Hours {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    // METHOD
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "INVALID";
        }
        return (getDurationString(seconds / 60, seconds % 60));
    }

    // METHOD
    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "INVALID MINUTES";
        }
        if (seconds < 0 || seconds > 59) {
            return "INVALID SECONDS";
        }
        int hours = minutes / 60;

        int remainMinutes = minutes % 60;
        int remainSeconds = seconds % 60;

        return (hours + "h " + remainMinutes + "m " + remainSeconds + "s");
    }
}
