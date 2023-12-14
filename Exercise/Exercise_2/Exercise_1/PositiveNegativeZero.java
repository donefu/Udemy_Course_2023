package Exercise_1;

/**
 * PositiveNegativeZero
 */
public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(1);

    }

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}