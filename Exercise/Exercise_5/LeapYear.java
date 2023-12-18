package Exercise_5;

public class LeapYear {
    public static void main(String[] args) {
        boolean check = isLeapYear(1800);
        System.out.println(check);
    }

    // METHOD
    public static boolean isLeapYear(int year) {
        // base case if year is invalid
        if (year < 1 || year > 9999) {
            return false;
        }
        // otherwise check all the conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
