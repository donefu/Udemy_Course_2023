package Exercise_14;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int day = getDaysInMonth(2, 2020);
        System.out.println(day);
    }

    // METHOD
    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // METHOD
    public static int getDaysInMonth(int month, int year) {
        int day;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    day = 31;
                    break;
                case 2:
                    if (isLeapYear(year) == true) {
                        day = 29;
                        break;
                    } else {
                        day = 28;
                        break;
                    }
                case 3:
                    day = 31;
                    break;
                case 4:
                    day = 30;
                    break;
                case 5:
                    day = 31;
                    break;
                case 6:
                    day = 30;
                    break;
                case 7:
                    day = 31;
                    break;
                case 8:
                    day = 31;
                    break;
                case 9:
                    day = 30;
                    break;
                case 10:
                    day = 31;
                    break;
                case 11:
                    day = 30;
                    break;
                case 12:
                    day = 31;
                    break;
                default:
                    day = -2;
                    break;
            }
            ;
        }
        return day;
    }
}
