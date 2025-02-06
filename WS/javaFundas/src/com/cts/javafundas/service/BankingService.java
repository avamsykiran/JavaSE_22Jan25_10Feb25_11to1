package com.cts.javafundas.service;

import com.cts.javafundas.exceptions.BankingException;
import com.cts.javafundas.models.BankAccount;

public class BankingService {

	private double minBal;

	public BankingService(double minBal) {
		super();
		this.minBal = minBal;
	}

	public void deposite(double amt, BankAccount acc) throws BankingException {

		if(amt<0) {
			throw new BankingException("Negative amount can not be deposited");
		}
		
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amt);
		}
	}

	public void withdraw(double amt, BankAccount acc) throws BankingException {
		if(amt<0) {
			throw new BankingException("Negative amount can not be withdrawn");
		}
		
		if(acc!=null) {
			if(acc.getBalance()-amt<minBal) {
				throw new BankingException("Insufficient funds to withdraw");
			}
			
			acc.setBalance(acc.getBalance()-amt);
		}		
	}
}
