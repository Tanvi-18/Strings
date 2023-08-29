package com.jsp.Strings;

public class Pallindrome {
	
	public static boolean pallindromeString(String s) {
		int low=0;
		int high=s.length()-1;
	
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}
			else{
				low++;
				high--;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String s = "MADAM";
		System.out.println(pallindromeString(s));
	}

}
