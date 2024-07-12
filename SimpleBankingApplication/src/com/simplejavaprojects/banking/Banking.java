package com.simplejavaprojects.banking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {
	public static void main(String[] args) throws IOException {
		
		String name;
		String id;
		String pass;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		pass = br.readLine();
		id = br.readLine();
		
		Factory factory  = new Factory();	
		AccountInterface account = factory.getAccess(name,pass,id);
		account.showMenu();
	}

}
