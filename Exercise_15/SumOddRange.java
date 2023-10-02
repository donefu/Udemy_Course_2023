package Exercise_15;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }

    // METHOD
    public static boolean isOdd(int number) {
        boolean check;
        if (number < 0) {
            check = false;
        } else if (number % 2 == 0) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

    // METHOD
    public static int sumOdd(int start, int end) {
        int total = 0;
        if ((end < start) || (end < 0) || (start < 0)) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    total += i;
                }
            }
        }
        return total;
    }
}
