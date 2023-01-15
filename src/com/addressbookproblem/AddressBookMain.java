package com.addressbookproblem;

public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("Welcome in AddressBook system");
        Contact familyBook=new Contact();
        System.out.println(familyBook);
        AddressBook contact= new AddressBook();
        
        contact.addContact();
        

    }
}
