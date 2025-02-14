package com.cts.javafundas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cts.javafundas.models.Employee;
import com.cts.javafundas.service.EmployeeNameWiseComparator;

public class App10CollectionsDemo {

	public static void main(String[] args) {
	
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1, "Vamsy",45000));
		emps.add(new Employee(9, "Varun",48000));
		emps.add(new Employee(6, "Vasavi",85000));
		emps.add(new Employee(2, "Vijay",59000));
		emps.add(new Employee(8, "Varma",65000));
		emps.add(new Employee(7, "Vinodh",57000));
		emps.add(new Employee(4, "Vinay",54000));
		emps.add(new Employee(3, "Amar",52000));
		emps.add(new Employee(5, "Charles",51000));
		emps.add(new Employee(1, "Vamsy",45000));
		
		System.out.println(emps.size() + " elements are added");
		
		for(Employee emp:emps) {
			System.out.println(emp);
		}
		
		System.out.println("---------------------------------------");
		
		Collections.sort(emps);
		for(Employee emp:emps) {
			System.out.println(emp);
		}

		System.out.println("---------------------------------------");
		
		Collections.sort(emps,new EmployeeNameWiseComparator());
		for(Employee emp:emps) {
			System.out.println(emp);
		}

	}

}
