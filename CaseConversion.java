package com.jsp.Strings;

public class CaseConversion {
	
	public static String caseConvert(String str) {
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char)(ch[i] + 32);
			}else
				if(ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char)(ch[i] - 32);
				}
		}
		
		return new String(ch);
	}
	
	
	public static void main(String[] args) {
		String s = "HeLLo GooD MORNIng";
		System.out.println(caseConvert(s));
	}

}
