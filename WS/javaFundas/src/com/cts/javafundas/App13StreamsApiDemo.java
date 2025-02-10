package com.cts.javafundas;

import java.util.ArrayList;
import java.util.List;

import com.cts.javafundas.models.Employee;

public class App13StreamsApiDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee(1, "Vamsy", 45000));
		emps.add(new Employee(9, "Varun", 48000));
		emps.add(new Employee(6, "Vasavi", 85000));
		emps.add(new Employee(2, "Vijay", 59000));
		emps.add(new Employee(8, "Varma", 65000));
		emps.add(new Employee(7, "Vinodh", 57000));
		emps.add(new Employee(4, "Vinay", 54000));
		emps.add(new Employee(3, "Amar", 52000));
		emps.add(new Employee(5, "Charles", 51000));
				
		emps.stream().forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		emps.stream()
		.map( e -> String.format("%s earns %.2f rupees each month",e.getFullName(),e.getNetPay() ))
		.forEach(System.out::println);
	
		System.out.println("----------------------------------------");
		
		Employee e = emps.stream().reduce(new Employee(), (e1,e2) -> e1.getNetPay()>e2.getNetPay()?e1:e2);
		System.out.println(e);
		
		System.out.println("----------------------------------------");
	
		emps.stream()
		.filter(emp -> emp.getNetPay()>=55000)
		.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		emps.stream()
		.filter(emp -> emp.getNetPay()>=55000)
		.map( emp -> String.format("%s earns %.2f rupees each month",emp.getFullName(),emp.getNetPay() ))
		.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
	}

}
