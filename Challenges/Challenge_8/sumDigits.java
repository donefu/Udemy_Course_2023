package Challenge_8;

public class sumDigits {
    public static void main(String[] args) {
        int number = 237;
        int result = sumDigitsFunct(number);
        System.out.println(result);
    }

    // METHOD

    public static int sumDigitsFunct(int number) {
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
