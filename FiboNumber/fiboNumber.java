import java.util.Scanner;

public class fiboNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int input = scan.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= 7) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
        scan.close();
    }
}
