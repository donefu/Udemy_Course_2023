package Exercise_20;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    // METHOD
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }
        int lastX = x % 10;
        int lastY = y % 10;
        int lastZ = z % 10;
        return (lastX == lastY || lastX == lastZ || lastY == lastZ);
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }
        return true;
    }
}
