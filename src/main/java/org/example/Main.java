package org.example;

import java.util.List;

public class Main {
        public static void main(String[] args){
            PhoneBook phoneBook = new PhoneBook();

//            Add contacts to the phonebook
            Contact contact1 = new Contact("Ojo Gabriel", "Gabba@gmail.com", "Imperial Oath", "08134657890");
            phoneBook.addContact(contact1);

            Contact contact2 = new Contact("Okoro James", "Bab@yahoo.com", "Oshodi", "07045678930");
            phoneBook.addContact(contact2);

            Contact contact3 = new Contact("Odekun Samuel", "Sammy@Decagon.dev", "Festac", "09067665641");
            phoneBook.addContact(contact3);

//             Search by name
            String searchName = "Ojo Gabriel";
            List<Contact> contactsByName = phoneBook.searchByName(searchName);
            System.out.println("Contacts with name '" + searchName + "':");
            for (Contact contact : contactsByName) {
                System.out.println(contact.getFullName() + " - " + contact.getPhoneNumber());
            }

            // Search by number
            String searchNumber = "08134657890";
            Contact contactByNumber = phoneBook.searchByNumber(searchNumber);
            if (contactByNumber != null) {
                System.out.println();

            }
        }
    }
