package Challenge_9;

import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + count + ": ");
            String input = scan.nextLine();
            try {
                // int validInput = Integer.parseInt(input);
                double validInput = Double.parseDouble(input);
                count++;
                sum += validInput;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (count <= 5);
        System.out.println(sum);
        scan.close();
    }
}
