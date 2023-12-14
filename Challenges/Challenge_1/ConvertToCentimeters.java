package Challenge_1;

public class ConvertToCentimeters {
    public static void main(String[] args) {
        double check = convertToCentimers(5, 8);
        System.out.println(check);
    }

    // METHOD
    public static double convertToCentimers(int height) {
        // 1 inch = 2.54 cm
        return (height * 2.54);
    }

    // METHOD
    public static double convertToCentimers(int feet, int inch) {
        // convert foot to inch by 1 foot = 12 inches
        double feetToCentimer = convertToCentimers(feet * 12);

        double inchToCentimer = convertToCentimers(inch);

        double total = (feetToCentimer + inchToCentimer);

        return total;
    }
}
