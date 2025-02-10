package com.cts.javafundas.service;

import java.util.Comparator;

import com.cts.javafundas.models.Employee;

public class EmployeeNameWiseComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}

}
