package Challenge_4;

public class dayOfWeek {
    public static void main(String[] args) {
        int day = 9;
        printDayOfWeek(day);
    }

    // METHOD
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            default -> ("Invalid day");
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
