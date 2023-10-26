package Exercise_28;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        boolean checker = false;
        int sum = 0;
        int count = 0;
        do {
            String input = scan.nextLine();
            try {
                int validInput = Integer.parseInt(input);
                sum += validInput;
                count++;

            } catch (NumberFormatException notValid) {
                checker = true;
            }
        } while (!checker);
        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scan.close();
    }
}
