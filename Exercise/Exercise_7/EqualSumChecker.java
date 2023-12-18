package Exercise_7;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean check = hasEqualSum(1, -1, 0);
        System.out.println(check);
    }

    // METHOD
    public static boolean hasEqualSum(int x, int y, int z) {
        return (x + y == z);
    }
}
