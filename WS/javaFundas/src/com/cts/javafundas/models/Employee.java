package com.cts.javafundas.models;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	public static final double TAX = 0.10;
	
	private int empId;
	private String fullName;
	private double basicPay;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String fullName, double basicPay) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.basicPay = basicPay;
	}
	
	public Employee(Employee e) {
		this(e.empId,e.fullName,e.basicPay);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public double getNetPay() {
		return basicPay - (basicPay*TAX); 
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", basicPay=" + basicPay + ", netPay: "+ getNetPay();
	}

	@Override
	public int hashCode() {
		return Objects.hash(basicPay, empId, fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basicPay) == Double.doubleToLongBits(other.basicPay) && empId == other.empId
				&& Objects.equals(fullName, other.fullName);
	}

	@Override
	public int compareTo(Employee o) {
		return ((Integer)this.empId).compareTo(o.empId);
	}

	
}
