package Exercise_25;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }

    // METHOD
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilos = bigCount * 5;

        if (bigKilos + smallCount < goal) {
            return false;
        } else if (goal % 5 > smallCount) {
            return false;
        }

        return true;
    }
}
