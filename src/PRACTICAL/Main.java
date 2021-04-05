package PRACTICAL;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    handleAddNewContact();
                    break;
                case 2:
                    handleFindContactByName();
                    break;
                case 3:
                    handleDisplayContacts();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
            }
        }
    }

    private static void handleDisplayContacts() {
        HashMap<String, Contact> contacts = addressBook.getAddressBook();
        Iterator iterator = contacts.entrySet().iterator();
        System.out.println("Address Book");
        System.out.println(String.format("%-20s| %s", "Contact name", "Phone number"));
        System.out.println("--------------------|-------------------");
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            Contact contact = (Contact) pair.getValue();
            System.out.println(String.format("%-20s| %s", contact.getName() , contact.getPhone()));
        }
        System.out.println("------SUCCESS------");
    }

    private static void handleFindContactByName() {
        System.out.print("Enter the contact name you want to find: ");
        String name = scanner.next();
        Contact contact = addressBook.findByName(name);
        System.out.println(String.format("%-20s%s", "Name", "Phone Number"));
        System.out.println("--------------------|-------------------");
        System.out.println(String.format("%-20s%s", contact.getName() , contact.getPhone()));
        System.out.println("------SUCCESS------");
    }

    private static void handleAddNewContact() {
        System.out.print("Enter a name: ");
        String name = scanner.next();
        System.out.print("Enter a phone number: ");
        String phone = scanner.next();

        addressBook.addContact(name, phone);
        System.out.println("------SUCCESS------");
    }

}
