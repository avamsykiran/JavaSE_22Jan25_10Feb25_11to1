package com.cts.javafundas;

import java.util.Scanner;

import com.cts.javafundas.exceptions.BankingException;
import com.cts.javafundas.models.BankAccount;
import com.cts.javafundas.service.BankingService;

public class App05CheckedExceptionsDemo {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount(5000);
		BankingService bs = new BankingService(1000);
		
		Scanner scan = new Scanner(System.in);
		
		String cmd=null;
		
		while(!"quit".equalsIgnoreCase(cmd)) {
			System.out.print("Command (deposite/withdraw/quit): ");
			cmd = scan.next();
			
			switch(cmd.toLowerCase()){
			case "deposite": 
				System.out.print("Amount to deposite: ");
				double amtToDeposite = scan.nextDouble();
				try {
					bs.deposite(amtToDeposite, acc);
					System.out.println("After Deposite the bal is: "+acc.getBalance());
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "withdraw": 
				System.out.print("Amount to withdraw: ");
				double amtToWithdraw = scan.nextDouble();
				try {
					bs.withdraw(amtToWithdraw, acc);
					System.out.println("After Withdrawal the bal is: "+acc.getBalance());
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit": 
				System.out.println("BYE");
				break;
			default:
				System.out.println("Unknown Command");
			}
		}
		
		scan.close();
	}

}
