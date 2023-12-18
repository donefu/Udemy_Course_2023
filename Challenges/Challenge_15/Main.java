package Challenge_15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        ArrayList<String> grocery = new ArrayList<>();

        do {
            printActions();
            input = scan.nextInt();
            scan.nextLine();
            switch (input) {
                case 1:
                    System.out.println("What do you want to add?");
                    String addItem = scan.nextLine();
                    if (grocery.contains(addItem)) {
                        System.out.println(addItem + " is already in the list");
                    } else {
                        grocery.add(addItem);
                    }
                    break;
                case 2:
                    String removeItem = scan.nextLine();
                    if (grocery.contains(removeItem)) {
                        grocery.remove(removeItem);
                    } else {
                        System.out.println(removeItem + " is not in the list to remove");
                    }
                    break;
            }
            grocery.sort(Comparator.naturalOrder());
            System.out.println(grocery);
        } while (input != 0);
        System.out.println("Here is the list: " + grocery);
    }

    private static void printActions() {
        String textBlock = """
            Available actions:

            0 - to shutdown

            1 - to add item(s) to list (comma delimited list)

            2 - to remove any items (comma delimited list)

            Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}


