package Challenge_14;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getIceBox().orderFood();
//
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenSate(true, false, true);
        kitchen.doKitchenWork();
    }
}
