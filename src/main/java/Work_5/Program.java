package Work_5;

import Work_5.phoneBook.*;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws BadEmailException, IOException {

        PhoneBook pb = new PhoneBook();

        pb.add(new Contact("Foxy", new Email("contact_f@mail"), new PhoneNumber("11111")));
        pb.add(new Contact("Amely", new Email("contact_a@mail"), new PhoneNumber("22222")));
        pb.add(new Contact("Alan", new Email("contact_a@mail"), new PhoneNumber("463453")));
        pb.add(new Contact("Kristin", new Email("contact_k@mail"), new PhoneNumber("77")));
        pb.add(new Contact("Sofi", new Email("contact_s@mail"), new PhoneNumber("7756455")));
        View v = new View();
        v.mainMenu(pb);
    }

}
