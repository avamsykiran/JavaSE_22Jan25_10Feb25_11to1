package com.cts.javafundas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App08ThreadDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		final String format = "dd-MMM-yyyy";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.format(formatter));
		
		System.out.println("DoB("+format+")? ");
		LocalDate dob = LocalDate.parse(scan.next(), formatter);
		
		Period age = Period.between(dob, today);
		System.out.println(String.format("You are %d years, %d months and %d days old", age.getYears(),age.getMonths(),age.getDays()));
		
		
		scan.close();
	}

}
