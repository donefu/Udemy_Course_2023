

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result;

        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            result = (long) Math.round((kilometersPerHour / 1.609));

        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
