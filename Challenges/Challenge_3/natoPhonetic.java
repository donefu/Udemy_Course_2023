package Challenge_3;

public class natoPhonetic {
    public static void main(String[] args) {

        char test = 'A';
        System.out.println(natoPhoneticExample(test));
    }

    // METHOD
    public static String natoPhoneticExample(char alphabet) {
        return switch (alphabet) {
            case 'A' -> alphabet + " is Able";
            case 'B' -> alphabet + " is Baker";
            case 'C' -> alphabet + " is Charlie";
            case 'D' -> alphabet + " is Dog";
            case 'E' -> alphabet + " is Easy";
            default -> "INVALID";
        };
    }
}
