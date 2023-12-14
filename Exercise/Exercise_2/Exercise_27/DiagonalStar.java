package Exercise_27;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    // METHOD
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
