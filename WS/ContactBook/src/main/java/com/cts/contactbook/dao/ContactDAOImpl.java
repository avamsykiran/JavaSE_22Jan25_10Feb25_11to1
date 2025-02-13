package com.cts.contactbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.contactbook.exception.ContactBookException;
import com.cts.contactbook.model.Contact;

public class ContactDAOImpl implements ContactDAO {

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/contactsdb","root","root");
	}
	
	@Override
	public void addContact(Contact contact) throws ContactBookException {
		try(
				Connection con = getConnection(); 
				PreparedStatement pst = con.prepareStatement("INSERT INTO contacts(cid,fnm,mob,mid) VALUES(?,?,?,?)")){
			
			pst.setInt(1, contact.getContactId());
			pst.setString(2, contact.getFullName());
			pst.setString(3, contact.getMobile());
			pst.setString(4, contact.getMailId());
			
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new ContactBookException("Insertion Failed! "+exp.getMessage());
		}
	}

	@Override
	public void updateContact(Contact contact) throws ContactBookException {
		try(
				Connection con = getConnection(); 
				PreparedStatement pst = con.prepareStatement("UPDATE contacts SET fnm=?,mob=?,mid=? WHERE cid=?")){
						
			pst.setString(1, contact.getFullName());
			pst.setString(2, contact.getMobile());
			pst.setString(3, contact.getMailId());
			pst.setInt(4, contact.getContactId());
			
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new ContactBookException("Updation Failed! "+exp.getMessage());
		}
	}

	@Override
	public void deleteContact(int contactID) throws ContactBookException {
		try(
				Connection con = getConnection(); 
				PreparedStatement pst = con.prepareStatement("DELETE FROM contacts WHERE cid=?")){		
			
			pst.setInt(1, contactID);
			
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new ContactBookException("Deletion Failed! "+exp.getMessage());
		}
	}

	@Override
	public List<Contact> getAllContacts() throws ContactBookException {
		List<Contact> contacts = new ArrayList<>();
		try(
				Connection con = getConnection(); 
				PreparedStatement pst = con.prepareStatement("SELECT cid,fnm,mob,mid FROM contacts")){						
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				contacts.add(new Contact(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		}catch(SQLException exp) {
			throw new ContactBookException("Retrival Failed! "+exp.getMessage());
		}
		return contacts;
	}

	@Override
	public Contact getContact(int contactId) throws ContactBookException {
		Contact contact = null;
		try(
				Connection con = getConnection(); 
				PreparedStatement pst = con.prepareStatement("SELECT cid,fnm,mob,mid FROM contacts WHERE cid=?")){
			
			pst.setInt(1, contactId);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				contact =new Contact(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}catch(SQLException exp) {
			throw new ContactBookException("Retrival Failed! "+exp.getMessage());
		}
		return contact;
	}

}
