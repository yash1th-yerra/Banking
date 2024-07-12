package com.basicjavaapplications.admin;

public class EmailContext {
	public Email getAdminDetails(String firstName,String lastName) {
		return new Email(firstName,lastName);
	}

	

}
