package org.comit.course._07_Practice;

public class INTTOSTRING {

	public static void main(String[] args) {
		
		int num=10;
		String str1=Integer.toString(num);
		System.out.println("Using tostring Method:-"+num);
		
		String str2=String.valueOf(num);
		System.out.println("Using stringvalueof Method:-"+num);
		
		String str3=String.format("%d", num);
		System.out.println("Using stringformat Method:-"+num);
	}

}
