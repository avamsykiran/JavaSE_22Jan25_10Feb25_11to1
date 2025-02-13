package com.cts.contactbook.exception;

@SuppressWarnings("serial")
public class ContactBookException extends Exception {

	public ContactBookException() {
		super();
	}

	public ContactBookException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ContactBookException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContactBookException(String message) {
		super(message);
	}

	public ContactBookException(Throwable cause) {
		super(cause);
	}
	
}
