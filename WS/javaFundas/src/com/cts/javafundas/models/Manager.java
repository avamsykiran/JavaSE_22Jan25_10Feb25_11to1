package com.cts.javafundas.models;

public class Manager extends Employee {

	private double hra;
	
	public Manager() {
		
	}
	
	public Manager(int empId, String fullName, double basicPay,double hra) {
		super(empId, fullName, basicPay);
		this.hra=hra;
	}

	@Override
	public double getNetPay() {
		return (getBasicPay() + hra) - ((getBasicPay() + hra)*TAX); 
	}

	@Override
	public String toString() {
		return super.toString() +", hra="+hra;
	}
	
}
