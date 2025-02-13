package com.cts.contactbook.service;

import java.util.List;

import com.cts.contactbook.dao.ContactDAO;
import com.cts.contactbook.dao.ContactDAOImpl;
import com.cts.contactbook.exception.ContactBookException;
import com.cts.contactbook.model.Contact;

public class ContactServiceImpl implements ContactService {
	
	private ContactDAO contactDao = new ContactDAOImpl();

	private boolean isValid(Contact contact) {
		boolean isOk = true;
		
		// all the validation logic goes here...
		
		return isOk;
	}
	
	@Override
	public void addContact(Contact contact) throws ContactBookException {
		if(contact!=null && isValid(contact)) {
			contactDao.addContact(contact);
		}
	}

	@Override
	public void updateContact(Contact contact) throws ContactBookException {
		if(contact!=null && isValid(contact)) {
			contactDao.updateContact(contact);
		}
	}

	@Override
	public void deleteContact(int contactID) throws ContactBookException {
		contactDao.deleteContact(contactID);
	}

	@Override
	public List<Contact> getAllContacts() throws ContactBookException {
		return contactDao.getAllContacts();
	}

	@Override
	public Contact getContact(int contactId) throws ContactBookException {
		return contactDao.getContact(contactId);
	}

}
