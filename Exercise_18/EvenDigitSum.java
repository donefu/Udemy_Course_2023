package Exercise_18;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    // METHOD
    public static int getEvenDigitSum(int number) {
        int total = 0;
        int lastDigit;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                total += lastDigit;
            }
            number /= 10;
        }
        return total;
    }
}
