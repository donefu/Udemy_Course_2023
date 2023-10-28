package Challenge_11;

public class ClassesChallenge {
    public static void main(String[] args) {
        Bank account = new Bank();

        account.setAccount_number("1234");
        account.depositFunds(2000);
        account.withdrawFunds(2000);
    }
}
