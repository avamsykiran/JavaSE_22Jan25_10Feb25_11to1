package com.cts.javafundas;

import com.cts.javafundas.models.Employee;

public class App01ClassAndObjectDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101,"Vamsy Kiran",55000);
		Employee emp3 = new Employee(emp2);
		Employee emp4 = emp2;

		System.out.println(emp1 + " hashcode: "+ emp1.hashCode());
		System.out.println(emp2 + " hashcode: "+ emp2.hashCode());
		System.out.println(emp3 + " hashcode: "+ emp3.hashCode());
		System.out.println(emp4 + " hashcode: "+ emp4.hashCode());
		
		System.out.println(emp2.equals(emp3));
		System.out.println(emp2.equals(emp4));
	}

}
