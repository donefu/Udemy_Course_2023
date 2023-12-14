package Challenge_5;

public class PrimeNumber {
    public static void main(String[] args) {
        countPrime();
    }

    // METHOD
    public static boolean isPrime(int wholeNum) {
        if (wholeNum < 2) {
            return false;
        }
        if (wholeNum == 2) {
            return true;
        }
        if (wholeNum % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(wholeNum); i += 2) {
            if (wholeNum % i == 0) {
                return false;
            }
        }
        return true;
    }

    // METHOD
    public static void countPrime() {
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("This " + i + " is a prime number");
                counter++;
                if (counter == 3) {
                    break;
                }
            }
        }
    }
}
