package com.cts.contactbook.dao;

import java.util.List;

import com.cts.contactbook.exception.ContactBookException;
import com.cts.contactbook.model.Contact;

public interface ContactDAO {
	void addContact(Contact contact) throws ContactBookException;
	void updateContact(Contact contact) throws ContactBookException;
	void deleteContact(int contactID) throws ContactBookException;
	List<Contact> getAllContacts() throws ContactBookException;
	Contact getContact(int contactId) throws ContactBookException;
}
