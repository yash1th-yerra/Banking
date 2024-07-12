package com.basicjavaapplications.admin;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		Email e =new EmailContext().getAdminDetails(firstName,lastName);
		System.out.println("Do you want to set mail capacity:[y/n]");
		String test = sc.next();
		if (test.toLowerCase().equals("y")) {
			int mailCapacity = sc.nextInt();
			e.setMailboxCapacity(600);
			System.out.println("mail capacity set to "+mailCapacity);
		}
		System.out.println("Do you want to set alternative email :[y/n]");
		String test2 = sc.next();

		if (test2.toLowerCase().equals("y")) {
			System.out.println("Enter Alternative email:");
			String altEmail = sc.next();
			e.setAlternateEmail(altEmail);
			
		}
		System.out.println("Do you want to set password:[y/n]");
		String test3 = sc.next();

		if (test3.toLowerCase().equals("y")) {
			
			System.out.println("set new password:");
			String altPass = sc.next();
			e.setPassword(altPass);
			System.out.println("New password set.");

		}
		

	}

}
