package com.codingTest.Encora;

public class Interview_Coding {
	public static void main(String[] args) {
	
		String str1="Asif Maner";
		String str2="Asif Maner";
		
		boolean value= Copairing(str1,str2);
		
		if(value) {
			System.out.println("Equals: ");
		}
		else {
			System.out.println("Not Equal: ");
		}
	
		
	}

	private static boolean Copairing(String str1, String str2) {
		return str1.equals(str2);
		
	}

}