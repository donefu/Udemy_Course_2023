package Challenge_12;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Dung", 1000,
                "dungphu2k1@gmail.com");
        System.out.println(customer.getCustomer_name());
        System.out.println(customer.getCustomer_limit());
        System.out.println(customer.getCustomer_email());

        Customer second_customer = new Customer();
        System.out.println(second_customer.getCustomer_name() + "\n " +
                second_customer.getCustomer_limit() + "\n " +
                second_customer.getCustomer_email());
    }
}
