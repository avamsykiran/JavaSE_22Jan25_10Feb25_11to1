package com.cts.javafundas.exceptions;

@SuppressWarnings("serial")
public class BankingException extends Exception {

	public BankingException() {
		super();
	}

	public BankingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BankingException(String message, Throwable cause) {
		super(message, cause);
	}

	public BankingException(String message) {
		super(message);
	}

	public BankingException(Throwable cause) {
		super(cause);
	}

}
