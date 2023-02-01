package Work_5.phoneBook;

public class Contact  implements Comparable<Contact>{

    private String name;
    private Email email;
    private PhoneNumber phoneNumber;



    public Contact(String name, Email email, PhoneNumber number) {
        this.name = name;
        this.email = email;
        this.phoneNumber = number;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(Email email) {
        this.email =  email;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email.get_email();
    }


    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t", this.getName(), this.getEmail(), this.getPhoneNumber());
    }

    public int compareTo(Contact otherContact) {
        return this.name.compareTo(otherContact.name);


    }
}
