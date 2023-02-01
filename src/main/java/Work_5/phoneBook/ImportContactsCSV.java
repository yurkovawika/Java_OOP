package Work_5.phoneBook;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ImportContactsCSV {
    public void open(PhoneBook pb, String type) throws IOException, BadEmailException {
        try {
            String[] elements = Files.readString(Paths.get("phone_book." + type)).split("\n", 0);
            int count = 0;
            for (int i = 0; i < elements.length; i++) {
                String[] element = elements[i].split(";");
                pb.add(new Contact(element[0], new Email(element[1]), new PhoneNumber(element[2])));
                count++;
            }
            System.out.printf("Import completed! + %d new contact(s)", count);
        } catch (IOException | BadEmailException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("file is empty");
        }

    }

}
