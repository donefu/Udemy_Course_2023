package Lessons.Patterns;

public class patterns {
    public static void main(String[] args) {
        pattern30(5);
    }

    // METHOD
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the columns
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // METHOD
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the columns
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // METHOD
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the columns
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int numberOfSpace = n - totalColsInRow;
            for (int space = 1; space <= numberOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            // Print numbers in decreasing order from 'row' to 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Print numbers in increasing order from 2 to 'row'
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }

}
