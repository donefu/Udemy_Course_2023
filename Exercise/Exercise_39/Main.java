package Exercise_39;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Tom", "123-456");
        Contact contact2 = new Contact("Dung", "408-480");
        Contact contact3 = new Contact("Elaine", "827-192");
        Contact contact4 = new Contact("Kelvin", "281-281");
        Contact test = new Contact("Jane", "428-480");
        MobilePhone mobilePhone = new MobilePhone("123456789");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        
        mobilePhone.removeContact(contact1);
        mobilePhone.printContacts();
    }
}
