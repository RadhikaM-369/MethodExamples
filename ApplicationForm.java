package com.trident.methods;

public class ApplicationForm {
	
	public static String applicantName(String name) {
		System.out.println("Name of the applicant is : ");
		return name;
	}

	public static void main(String[] args) {
		
		String addName = "Madhurima";
		ApplicationForm.applicantName(addName);
		System.out.println(addName);
	}

}
