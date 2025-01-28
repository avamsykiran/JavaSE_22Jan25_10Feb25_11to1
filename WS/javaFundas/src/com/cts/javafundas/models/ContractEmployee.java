package com.cts.javafundas.models;

public class ContractEmployee extends Employee {

	private int contractDuration;

	public ContractEmployee(int empId, String fullName, double basicPay, int contractDuration) {
		super(empId, fullName, basicPay);
		this.contractDuration = contractDuration;
	}
	
	@Override
	public String toString() {
		return super.toString() +", Contract Duration="+contractDuration;
	}
}
