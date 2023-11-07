package StringFormat;

public class Main {
    public static void main(String[] args) {
//        String bulletIt = "Print a bulleted List:\n" +
//                "\t\u2022 First Point\n" +
//                "\t\t\u2022 Sub Point";
//        System.out.println(bulletIt);
//
//        String textBlock = """
//                Print a bulleted list:
//                            \u2022 First Point
//                                \u2022 Sub Point """;
//        System.out.println(textBlock);
//
//        int age =35;
//        System.out.printf("Your age is %d%n", age);
//
//        int yearOfBirth = 2023 - age;
//        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);
//
//        System.out.printf("Your age is %.2f%n", (float)age);
//
//        for (int i = 1 ; i <= 100000 ; i *= 10) {
//            System.out.printf("Printing %6d %n", i);
//        }
//
//        String formattedString = String.format("Your age is %d", age);
//        System.out.println(formattedString);
//
//        formattedString = "Your age is %d".formatted(age);
//        System.out.println(formattedString);
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String start with hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with world");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }


    }

    public static void printInformation (String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length -1));
    }
}
