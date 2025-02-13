package com.cts.contactbook.model;

import java.util.Objects;

/*
 CREATE TABLE contacts(
 	cid int primary key,
 	fnm varchar(50),
 	mob char(10),
 	mid varchar(100)
 );
 * */

public class Contact {

	private int contactId;
	private String fullName;
	private String mobile;
	private String mailId;
	
	public Contact() {
		
	}

	public Contact(int contactId, String fullName, String mobile, String mailId) {
		super();
		this.contactId = contactId;
		this.fullName = fullName;
		this.mobile = mobile;
		this.mailId = mailId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactId, fullName, mailId, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return contactId == other.contactId && Objects.equals(fullName, other.fullName)
				&& Objects.equals(mailId, other.mailId) && Objects.equals(mobile, other.mobile);
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", fullName=" + fullName + ", mobile=" + mobile + ", mailId="
				+ mailId + "]";
	}
	
	
	
}
