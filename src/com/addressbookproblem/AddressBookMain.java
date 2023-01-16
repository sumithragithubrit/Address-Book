package com.addressbookproblem;

public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("Welcome in AddressBook system");
        Contact con =new Contact();
        System.out.println(con);
        AddressBook familyBook = new AddressBook();
        familyBook.addContact();
       
    }
}
