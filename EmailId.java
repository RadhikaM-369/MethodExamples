package com.trident.methods;

public class EmailId {
	public static void login(String Un, String pwd) {
		String userName= "admin";
		String password="Test";
		
		if (userName==Un && password==pwd) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("login failed");
		}	}

	public static void main(String[] args) {
			
		EmailId.login("admin","Test");
	}

}
