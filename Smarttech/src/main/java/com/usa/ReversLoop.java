package com.usa;

public class ReversLoop {

	public static void main(String[] args) {
		
		String name = "Smarttech";
		String reversedString = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			reversedString = reversedString + name.charAt(i);
		}
		
		System.out.println("The reversed String " + name + " is:" );
		System.out.println(reversedString);
	}
	
}
