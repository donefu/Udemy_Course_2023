package Exercise_4;

public class BarkingDog {
    public static void main(String[] args) {
        boolean check = shouldWakeUp(true, 4);
        System.out.println(check);
    }

    // METHOD
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // base case if hour of day is invalid
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // otherwise check all the conditions
        if (!barking || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        } else {
            return true;
        }
    }
}
