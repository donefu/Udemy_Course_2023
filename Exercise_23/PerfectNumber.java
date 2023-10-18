package Exercise_23;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }

    // METHOD
    public static boolean isPerfectNumber(int num) {
        int total = 0;
        if (num < 1) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return (total == num);
    }
}
