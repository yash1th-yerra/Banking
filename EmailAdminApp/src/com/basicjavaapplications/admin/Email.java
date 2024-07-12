package com.basicjavaapplications.admin;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity =500;
	private String alternateEmail;
	private int defaultPassLength = 10;
	private String companySuffix = "yycompany.com";

	// constructor to receive first and last names
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for " + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		this.password = randomPassword(defaultPassLength);
		System.out.println("Your generated password is " + this.password);
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your company email: " + email);

	}

	// ask for the department
	private String setDepartment() {
		System.out.println("Enter the department\n1. Sales\n2. Development\n3. Accounting\n4. None");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();

		if (deptChoice == 1)
			return "sales";

		else if (deptChoice == 2)
			return "development";

		else if (deptChoice == 3)
			return "accounting";

		else
			return "";

	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890abcdefghijklmnopqrstuvwxyz";
		char[] passWord = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			passWord[i] = passwordSet.charAt(rand);
		}
		return new String(passWord);
	}

	// set a mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// set the alternative email
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;
		System.out.println("Alternative email has been created : "+this.alternateEmail);
	}

	// change the password
	public void setPassword(String pass) {
		this.password = pass;
	}

}
