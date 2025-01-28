package com.cts.javafundas;

import com.cts.javafundas.models.ContractEmployee;
import com.cts.javafundas.models.Employee;
import com.cts.javafundas.models.Manager;

public class App02InheretenceAndPolymorphsimDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Vamsy Kiran",55000);
		ContractEmployee cemp = new ContractEmployee(102,"Murthy",55000,10);
		Manager mgr = new Manager(103,"Suresh",55000,5000);
		
		System.out.println(emp);
		System.out.println(cemp);
		System.out.println(mgr);

	}

}
