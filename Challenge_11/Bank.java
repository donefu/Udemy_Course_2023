package Challenge_11;

public class Bank {
    private String account_number;
    private double account_balance;
    private String name;
    private String email;
    private String phone_number;

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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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
