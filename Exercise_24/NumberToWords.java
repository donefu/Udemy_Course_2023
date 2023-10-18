package Exercise_24;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
    }

    // METHOD
    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // METHOD
    public static int reverse(int number) {
        int reverse = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        if (number < 0) {
            return (reverse * -1);
        }
        return reverse;
    }

    // METHOD
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int newNum = reverse(number);
            while (newNum > 0) {
                int remainder = newNum % 10;
                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                newNum /= 10;
            }
            int zeroCount = getDigitCount(number) - getDigitCount(reverse(number));
            while (zeroCount > 0) {
                System.out.println("Zero");
                zeroCount--;
            }
        }
    }
}
