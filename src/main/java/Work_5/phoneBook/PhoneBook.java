package Work_5.phoneBook;

import java.util.*;

public class PhoneBook extends contactComparator {
    private final List<Contact> contacts;

    private int count = 0;

    public PhoneBook(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }


    public int size() {
        return contacts.size();
    }

    public void printAllContacts() {

        for (Contact contact1 : getContacts()) {
            System.out.print(count + ")\t");
            System.out.println(contact1.toString());
            counter();
        }
        count = 0;
    }


    private void counter() {
        count++;
    }

    public Contact getContact(int idx) throws IndexOutOfBoundsException {
        return this.contacts.get(idx);
    }


    public void add(Contact contact) {

        this.contacts.add(contact);
    }

    public void changeName(int idx, String newName) {
        contacts.get(idx).setName(newName);
    }

    public void changeEmail(int idx, Email newEmail) {

        this.contacts.get(idx).setEmail(newEmail);
    }

    public void changePhoneNumber(int idx, PhoneNumber phoneNumber) {
        this.contacts.get(idx).setPhoneNumber(phoneNumber);
    }


    public void deleteContact(int idx) {
        this.contacts.remove(idx);
    }

    public void sortList() {
        contactComparator contactComparator = new contactComparator();
        Collections.sort(contacts, contactComparator);
    }


    @Override
    public String toString() {
        return "contacts=" + contacts;
    }

}
