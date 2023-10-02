package Challenge_6;

public class sum3_and_5 {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                total += i;
                count++;
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum is " + total);
    }
}
