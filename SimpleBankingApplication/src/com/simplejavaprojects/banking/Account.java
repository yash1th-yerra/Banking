package com.simplejavaprojects.banking;

import java.util.Scanner;

public class Account implements AccountInterface {
	private int balance;
	private int previousTransaction;
	String customerName;
	String customerId;
	
	Account(String cname,String cid){
		customerName = cname;
		customerId = cid;
	}
	

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance += amount;
			previousTransaction = amount;
		}

	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance-=amount;
			previousTransaction = -amount;
		}

	}
	public void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited: "+previousTransaction);
			
		}
		else if(previousTransaction<0) {
			System.out.println("Withdraw: "+previousTransaction);
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}

	@Override
	public void calculate(int years) {
		// TODO Auto-generated method stub
		double rate = 0.125;
		double newBalance  = (balance * rate * years) + balance;
		System.out.println("The current interest is "+(100*rate));
		System.out.println("After "+years+" years,your balance will be "+newBalance);

	}
	
	public void showMenu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome, "+customerName+"!!");
		System.out.println("Your id is: "+customerId);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Mini Statement");
		System.out.println("E. Calculate Interest");
		System.out.println("F. Exit");
		do {
			System.out.println();
			System.out.println("Enter your option: ");
			char option1 = sc.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			switch(option) {
			case 'A':
				System.out.println("***************************");
				System.out.println("Balance: Rs."+balance);
				System.out.println("***************************");
				System.out.println();
				break;
			case 'B':
				System.out.println("Enter Amount: ");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println();
				break;
			case 'C':
				System.out.println("Enter Amount: ");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			case 'D':
				System.out.println("***************************");
				getPreviousTransaction();
				System.out.println("***************************");
				System.out.println();
				break;
			case 'E':
				System.out.println("Enter How many years of accured interest");
				int years = sc.nextInt();
				calculate(years);
				break;
			case 'F':
				System.out.println("***************************");
				break;
			default:
				System.out.println("Invalid Input!! Please Enter Valid Input");
				break;
			}
		}while(option!='F');
		System.out.println("Thanking you for Banking with us!!");
		
	}
	

}
