package Exercise_19;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    // METHOD
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int firstX = x / 10;
        int firstY = y / 10;
        int lastX = x % 10;
        int lastY = y % 10;
        if (firstX == firstY || firstX == lastY || lastX == firstY || lastX == lastY) {
            return true;
        }
        return false;
    }
}
