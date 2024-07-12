package com.simplejavaprojects.banking;

public class Factory {
	String cName;
	String password;
	
	public AccountInterface getAccess(String uname,String pass,String uid) {
		if(pass.equalsIgnoreCase("user")) {
			return new Account(uname,uid);
		}
		return null;
	}

}
