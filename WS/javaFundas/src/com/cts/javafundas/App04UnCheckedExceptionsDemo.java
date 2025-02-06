package com.cts.javafundas;

import java.util.Scanner;

public class App04UnCheckedExceptionsDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A number: ");
		while(!scan.hasNextInt()) {
			System.out.println(scan.next() + " is not a number");
		}
		int n1 = scan.nextInt();
		System.out.print("Another number: ");
		while(!scan.hasNextInt()) {
			System.out.println(scan.next() + " is not a number");
		}
		int n2 = scan.nextInt();

		if(n2==0) {
			System.out.println("Zero is not an acceptable divisor");
		}else {
			System.out.println("Qut: "+(n1/n2));	
		}
		
		scan.close();
	}

}
