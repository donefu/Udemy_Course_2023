
package Lessons.ArrayList.Grocery;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count) {
    public GroceryItems(String name) {
        this(name, "Dairy", 1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("milk");
        groceryArray[1] = new GroceryItems("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItems("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        // ArrayList objectList = new ArrayList();
        // objectList.add(new GroceryItems("Butter"));
        // objectList.add("Yogurt");

        ArrayList<GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("Butter"));
        groceryList.add(new GroceryItems("milk"));
        groceryList.add(new GroceryItems("oranges", "PRODUCE", 6));
        groceryList.set(0,
                        new GroceryItems ("apples", "PRODUCE", 6));
        groceryList.remove(groceryList);
        System.out.println(groceryList);
    }

}