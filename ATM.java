package com.trident.methods;

public class ATM {
	public static void withdraw(int amount) {
		System.out.println("Amount withdraw successfully");
	}

	public static void main(String[] args) {
		int amount=30000;
		ATM.withdraw(amount);
	}

}
