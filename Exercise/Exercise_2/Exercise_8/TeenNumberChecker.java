package Exercise_8;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean check = hasTeen(9, 99, 19);
        System.out.println(check);
    }

    // METHOD
    public static boolean hasTeen(int x, int y, int z) {
        if (isTeen(x) || isTeen(y) || isTeen(z)) {
            return true;
        } else {
            return false;
        }
    }

    // METHOD
    public static boolean isTeen(int x) {
        return ((x > 12 && x < 20));
    }
}
