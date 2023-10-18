package Exercise_16;

public class Number_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
    }

    // METHOD
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int remainder = temp % 10;
            reverse *= 10;
            reverse += remainder;
            temp /= 10;
        }
        return Math.abs(number) == reverse;
    }
}
