package com.jsp.Strings;

public class Strings {
	
	public static void main(String[] args) {
		
		//  Way of declaring a String
			String s1 = "Hello";
			String s2 = "Hello";
			
			String s3 = new String("Hello");
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			
			
			String s4 = "Good ";
			String s5 = "Morning";
			String res = s4.concat(s5);
			System.out.println(res);
						
	}
}
