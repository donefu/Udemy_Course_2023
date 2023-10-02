package Challenge_8;

public class sumDigits {
    public static void main(String[] args) {
        int number = -125;
        System.out.println(sumDigits(number));
    }

    // METHOD

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int right;
        int sum = 0;
        while (number != 0) {
            right = number % 10;
            sum += right;
            number /= 10;
        }
        return sum;
    }
}
