package Challenge_10;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean checker = false;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        do {
            System.out.println("Enter a number, or any character to exit: ");
            String input = scan.nextLine();
            try {
                double validInput = Double.parseDouble(input);
                if (validInput > max) {
                    max = validInput;
                }
                if (validInput < min) {
                    min = validInput;
                }
            } catch (NumberFormatException nfe) {
                checker = true;
            }
        } while (!checker);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
