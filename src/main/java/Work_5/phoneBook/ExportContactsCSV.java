package Work_5.phoneBook;

import java.io.*;

public class ExportContactsCSV {
    private FileOutputStream file;

    public void save(PhoneBook pb, String type) throws FileNotFoundException {

        file = new FileOutputStream("phone_book." + type, false);
        try {
            for (Contact contact : pb.getContacts()) {
                if (type.equalsIgnoreCase("html")) {
                    file.write(String.format("%s;%s;%s;<br />\n", contact.getName(), contact.getEmail(), contact.getPhoneNumber()).getBytes());
                } else
                    file.write(String.format("%s;%s;%s;\n", contact.getName(), contact.getEmail(), contact.getPhoneNumber()).getBytes());
            }
            System.out.println("Export completed!");
            file.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
