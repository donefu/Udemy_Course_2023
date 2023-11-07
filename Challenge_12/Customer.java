package Challenge_12;

public class Customer {
    private String customer_name;
    private double customer_limit;
    private String customer_email;

    // Constructors

    public Customer (String name, double limit, String email) {
        this.customer_name = name;
        this.customer_limit = limit;
        this.customer_email = email;
    }

    public Customer () {
        this ("Default Name", "Default Email");
    }

    public Customer (String name, String email) {
        this (name, 100.0, email);
    }
    
    // getter

    public String getCustomer_name() {
        return customer_name;
    }
    public double getCustomer_limit() {
        return customer_limit;
    }
    public String getCustomer_email() {
        return customer_email;
    }

    
}
