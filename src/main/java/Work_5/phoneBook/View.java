
package Work_5.phoneBook;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    public void mainMenu(PhoneBook pb) throws BadEmailException, IOException, InputMismatchException {
        Scanner scan = new Scanner(System.in);

        while (true) {
            pb.sortList();
            System.out.println();
            System.out.print("""
                    Menu phone book:
                    \t1. Add new contact;
                    \t2. Set contact;
                    \t3. Export | Import;
                    \t4. View all contacts;
                                        
                    \t0. Exit
                                        
                    ***Enter your choice ----->>\s""");

            try {
                int cmd = scan.nextInt();
                switch (cmd) {
                    case 1:
                        pb.add(addContact(scan));
                        break;
                    case 2:
                        if (pb.size() == 0)
                            System.out.println("Phone book is empty");//Изменить контак
                        else {
                            editContact(pb);
                            break;
                        }
                        break;
                    case 3://меню экспорта и импорта
                        menuExportImport(pb, scan);
                        break;
                    case 4://показать все контакты
                        pb.printAllContacts();
                        break;
                    case 0:
                        scan.close();
                        return;
                    default:
                        System.out.println("Menu is not implemented");
                }
            } catch (InputMismatchException e) {
                System.out.println("Menu is not implemented");
                mainMenu(pb);
            }
        }
    }

    private Contact addContact(Scanner scan) throws BadEmailException, NumberFormatException {
        Contact newContact = new Contact(newName(scan), newEmail(scan), newNumber(scan));
        System.out.printf("Add contact %s.\n", newContact.getName());
        return newContact;
    }

    private void editContact(PhoneBook pb) throws BadEmailException, IOException, NullPointerException, IndexOutOfBoundsException {

        System.out.println("Select contact index to change. ");
        pb.printAllContacts();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter index: ");
            int choice = sc.nextInt();
            pb.getContact(choice);
            System.out.print("""
                    Editing a contact:
                                    
                    \t1. Change name;
                    \t2. Change email;
                    \t3. Сhange phone number;
                    \t4. Delete contact;                                    
                    \t0. Main menu;

                    ***Enter your choice ----->>\s""");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter new name:");
                    pb.changeName(choice, sc.next());
                    System.out.println("Name changed.");
                    break;
                case 2:
                    System.out.println("Enter new email:");
                    pb.changeEmail(choice, newEmail(sc));
                    break;
                case 3:
                    System.out.println("Enter new phone:");
                    pb.changePhoneNumber(choice, newNumber(sc));
                    break;
                case 4:
                    pb.deleteContact(choice);
                    break;
                case 0:
                    mainMenu(pb);
                    break;

                default:
                    System.out.println("Menu is not implemented");
                    break;
            }

        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    private PhoneNumber newNumber(Scanner scan) throws NumberFormatException {
        try {
            System.out.print("Enter phone number: ");
            String number = scan.next();
            return new PhoneNumber(number);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return newNumber(scan);
        }
    }

    private String newName(Scanner scan) throws NumberFormatException {
        try {
            System.out.print("Enter name: ");
            String name = scan.next();
            return name;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return newName(scan);
        }
    }

    private Email newEmail(Scanner scan) throws BadEmailException {
        try {
            System.out.print("Enter email: ");
            String email = scan.next();
            return new Email(email);
        } catch (BadEmailException e) {
            System.out.println(e.getMessage());
            return newEmail(scan);
        }
    }

    private void menuExportImport(PhoneBook pb, Scanner sc) throws BadEmailException, IOException {
        System.out.print("""
                Export to..:
                \t1. CSV file ;
                \t2. TXT file;
                \t3. HTML file;

                Import to..:
                \t4. CSV file ;
                \t5. TXT file;
                \t6. HTML file;

                \t0. main menu;
                \t9. Exit;
                                
                ***Enter your choice ----->>\s""");

        ExportContactsCSV exportContacts = new ExportContactsCSV();
        ImportContactsCSV importContacts = new ImportContactsCSV();
        switch (sc.nextInt()) {
            case 1:
                exportContacts.save(pb, "csv");
                break;
            case 2:
                exportContacts.save(pb, "txt");
                break;
            case 3:
                exportContacts.save(pb, "html");
                break;

            case 4:
                importContacts.open(pb, "csv");
                break;
            case 5:
                importContacts.open(pb, "txt");
                break;
            case 6:
                importContacts.open(pb, "html");
                break;
            case 0:
                mainMenu(pb);
            case 9:
                return;
            default:
                System.out.println("Menu is not implemented");

        }
    }
}


    

