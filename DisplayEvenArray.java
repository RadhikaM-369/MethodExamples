package com.trident.methods;

public class DisplayEvenArray {
	
		public static void evenNumbers(int arr[]) {
		
		for(int i=0;i < arr.length;i++)
		{
			if(arr[i]%2==0)
			 System.out.println(arr[i]);
		}
		}
		
	public static void main(String[] args) {
				
		int issueNumber[]= {110,123,154,167,178,176,198,177,197};
		DisplayEvenArray.evenNumbers(issueNumber);
	}

}
