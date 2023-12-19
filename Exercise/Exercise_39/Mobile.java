package Exercise_39;


import java.util.ArrayList;

class MobilePhone  {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone (String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        
        if (findContact(contact.getName()) >= 0 || findContact(contact.getPhoneNumber()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println(contact.getName() + " is removed from the Contact");
            myContacts.remove(contact);
            return true;
        }
        else {
            System.out.println(contact.getName() + " is not in the Contact so cannot remove");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact.getName()) == findContact(newContact.getName()) && findContact(oldContact.getPhoneNumber()) == findContact(newContact.getPhoneNumber())) {
            System.out.println(oldContact.getName() + " with the number of " + oldContact.getPhoneNumber() + " is found in the Contact already");
            return false;
        }
        else if (findContact(oldContact) < 0) {
            System.out.println(oldContact.getName() + " is not found in the Contact");
            return false;
        }
        myContacts.set(findContact(oldContact), newContact);
        System.out.println(oldContact.getName() + " is replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) != -1) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}

