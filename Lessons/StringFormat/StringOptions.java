
package Lessons.StringFormat;

public class StringOptions {
    public static void main(String[] args) {
//        String helloWorld = "Hello" + " World";
//        helloWorld.concat(" and Goodbye");
//
//        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
//        helloWorldBuilder.append(" and Goodbye");
//
//        printInformation(helloWorld);
//        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart2 = new StringBuilder(32);
        emptyStart2.append("a".repeat(17));


        printInformation(emptyStart);
        printInformation(emptyStart2);

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        helloWorldBuilder.deleteCharAt(16).insert(16, 'g');
        System.out.println(helloWorldBuilder);

        helloWorldBuilder.replace(16, 17, "G");
        System.out.println(helloWorldBuilder);

        helloWorldBuilder.reverse().setLength(7);
        System.out.println(helloWorldBuilder);
    }

    public static void printInformation (String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public static void printInformation (StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
