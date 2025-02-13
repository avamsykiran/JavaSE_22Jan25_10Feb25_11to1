package com.cts.contactbook;

import java.util.List;
import java.util.Scanner;

import com.cts.contactbook.exception.ContactBookException;
import com.cts.contactbook.model.Contact;
import com.cts.contactbook.service.ContactService;
import com.cts.contactbook.service.ContactServiceImpl;

public class ContactApp {

	private static ContactService contactService;
	private static Scanner scan;

	public static void main(String[] args) {

		contactService = new ContactServiceImpl();
		scan = new Scanner(System.in);

		String cmd = null;

		while (!"quit".equalsIgnoreCase(cmd)) {
			System.out.println("Cmd (LIST/ADD/QUIT): ");
			cmd = scan.next().toLowerCase();

			switch (cmd) {
			case "list":
				doList();
				break;
			case "add":
				doAdd();
				break;
			case "quit":
				System.out.println("App Terminated");
				break;
			default:
				System.out.println("UnKnown Command");
			}
		}

		scan.close();

	}

	private static void doAdd() {
		Contact c = new Contact();

		System.out.println("Id: ");
		c.setContactId(scan.nextInt());
		System.out.println("Name: ");
		c.setFullName(scan.next());
		System.out.println("Mobile: ");
		c.setMobile(scan.next());
		System.out.println("Mail Id: ");
		c.setMailId(scan.next());

		try {
			contactService.addContact(c);
			System.out.println("Contact Added");
		} catch (ContactBookException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void doList() {
		try {
			List<Contact> contacts = contactService.getAllContacts();
			
			if(contacts.isEmpty()) {
				System.out.println("No records to display");
			}else {
				contacts.stream().forEach(System.out::println);
			}
		} catch (ContactBookException e) {
			System.out.println(e.getMessage());
		}
	}

}
