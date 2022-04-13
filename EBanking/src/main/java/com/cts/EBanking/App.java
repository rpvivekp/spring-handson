package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		
		DecimalFormat dcf = new DecimalFormat("0.00");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount smAccount = ctx.getBean("smartBankAccount",SmartBankAccount.class);
		System.out.println("Welcome Mr/Ms: "+smAccount.getName());
		System.out.println("Your customer id is: "+smAccount.getCustomerId());
		System.out.println("Please select account type");
		System.out.println("1 CurrentAccount");
		System.out.println("2 RecurringAccount");
		System.out.println("3 FixedAccount");
		
		Scanner scanner = new Scanner(System.in);		

		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				//Do call deposite
				System.out.println("Enter amount to be deposited");
				double amount = scanner.nextDouble();
				double balance = smAccount.doDeposit(amount);
				System.out.println("Your balance amount is "+dcf.format(balance));

			} else if (choice == 2) {
				//Do call Withdraw	
				System.out.println("Enter amount to be withdrawn");
				double amount = scanner.nextDouble();
				double balance = smAccount.doWithdraw(amount);
				System.out.println("Your balance amount is "+dcf.format(balance));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			double amount = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int months = scanner.nextInt();
			double balance = smAccount.calculateRecurringAccount(amount,months);
			System.out.println("Your balance after "+months+" months will be "+balance);
		
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD amount");
			double amt = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int mon = scanner.nextInt();
			double bal = smAccount.calculateFixedAccount(amt,mon);
			System.out.println("Your balance after "+mon+" months will be "+bal);
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
