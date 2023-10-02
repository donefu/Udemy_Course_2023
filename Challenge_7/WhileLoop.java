package Challenge_7;

public class WhileLoop {
    public static void main(String[] args) {
        int countEven = 0;
        int numStart = 4;
        while (numStart <= 20) {
            numStart++;
            if (!isEvenNumber(numStart)) {

                continue;
            }
            countEven++;
            System.out.println("Even number " + numStart);
            if (countEven >= 5) {
                break;
            }
        }
    }

    // METHOD
    public static boolean isEvenNumber(int num) {
        if (num % 2 != 0) {
            return false;
        }
        return true;
    }
}
