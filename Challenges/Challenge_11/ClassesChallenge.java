package Challenge_11;

public class ClassesChallenge {
    public static void main(String[] args) {
         Bank account = new Bank("1234", 1000, "Bob",
         "myemail@gmail.com", "408-489-9278");
         System.out.println(account.getAccount_balance());
         System.out.println(account.getName());

         // Bank account = new Bank();
         System.out.println(account.getName());

         Bank tim_account = new Bank("Tim", "tim@gmail.com", "408-490-9282");
         System.out.println(tim_account.getName());
    }
}
