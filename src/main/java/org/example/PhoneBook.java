package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook{
//    private Map<String, Contact> contacts;
//
//    public PhoneBook (){
//        contacts = new HashMap<>();
//    }
//    public void addContacts(PhoneBook phoneBook){
//        phoneBook.put

    private Map<String, List<Contact>> contactsByName;
    private Map<String, Contact> contactsByNumber;

    public PhoneBook() {
        contactsByName = new HashMap<>();
        contactsByNumber = new HashMap<>();
    }

    public void addContact(Contact contact) {
        String name = contact.getFullName();
        List<Contact> contacts = contactsByName.getOrDefault(name, new ArrayList<>());
        contacts.add(contact);
        contactsByName.put(name, contacts);

        String phoneNumber = contact.getPhoneNumber();
        contactsByNumber.put(phoneNumber, contact);
    }

    public List<Contact> searchByName(String name) {
        return contactsByName.getOrDefault(name, new ArrayList<>());
    }

    public Contact searchByNumber(String phoneNumber) {
        return contactsByNumber.get(phoneNumber);
    }
}
