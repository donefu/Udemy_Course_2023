package Exercise_12;

public class PlayingCat {
    public static void main(String[] args) {
        boolean checker = isCatPlaying(false, 35);
        System.out.println(checker);
    }

    // METHOD
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean check;
        if (summer == true) {
            if (temperature > 24 && temperature <= 45) {
                check = true;
            } else {
                check = false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }
}
