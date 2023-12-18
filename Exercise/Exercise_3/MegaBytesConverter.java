package Exercise_3;

/**
 * MegaBytesConverter
 */
public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);

    }

    // METHOD

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            // 1 MB = 1024 KB
            int megaByte = Math.round(kiloBytes / 1024);
            int tempKilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + tempKilo + " KB");
        }
    }
}