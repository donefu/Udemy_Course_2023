package Exercise_22;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    // METHOD
    public static int getGreatestCommonDivisor(int first, int second) {
        int i = 1;
        int result = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        while (i <= first || i <= second) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
            i++;
        }
        return result;
    }
}