package Challenge_11;

public class Bank {
    private String account_number;
    private double account_balance;
    private String account_name;
    private String account_email;
    private String account_phone_number;

    public Bank() {
        this("5678", 2.50, "Default Name",
                "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    public Bank(String number, double balance, String name, String email, String phone_number) {
        this.account_number = number;
        this.account_balance = balance;
        this.account_name = name;
        account_email = email;
        account_phone_number = number;
    }

    public Bank (String name, String email, String phoneNumber) {
        this("9999", 100.5, name, email, phoneNumber);
    }

    // Getter and Setter
    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public String getName() {
        return account_name;
    }

    public void setName(String name) {
        this.account_name = name;
    }

    public String getEmail() {
        return account_email;
    }

    public void setEmail(String email) {
        this.account_email = email;
    }

    public String getPhone_number() {
        return account_phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.account_phone_number = phone_number;
    }

    // METHOD

    public void withdrawFunds(double amount) {
        if (account_balance - amount < 0) {
            System.out.println("Not enough balance. You only have $" + account_balance);
        } else {
            account_balance -= amount;
            System.out.println("balance after withdraw: $" + account_balance);
        }
    }

    public void depositFunds(double amount) {
        account_balance += amount;
        System.out.println("balance after deposit $" + account_balance);
    }
}
