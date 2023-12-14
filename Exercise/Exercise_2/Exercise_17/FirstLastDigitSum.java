package Exercise_17;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    // METHOD
    public static int sumFirstAndLastDigit(int number) {
        int total = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            if (number < 10) {
                firstDigit = number;
            }
            number /= 10;
        }
        total = firstDigit + lastDigit;
        return total;
    }
}
