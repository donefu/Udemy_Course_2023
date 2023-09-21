package Exercise_6;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean check = areEqualByThreeDecimalPlaces(3.176, 3.175);
        System.out.println(check);
    }

    // METHOD
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        //
        int num1_check = (int) (num1 * 1000);
        int num2_check = (int) (num2 * 1000);
        if (num1_check - num2_check == 0) {
            return true;
        } else {
            return false;
        }
    }
}