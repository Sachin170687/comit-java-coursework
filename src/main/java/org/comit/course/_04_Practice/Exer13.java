package org.comit.course._04_Practice;


/*13.Write a Java program to compare the following two strings, ignoring case considerations.
*/

public class Exer13 {

	public static void main(String[] args) {
		
		String str1 = "I love coding in Java";
		String str2 = "I Love Coding In Java";
		
		if(str1.compareToIgnoreCase(str2)==0) {
		System.out.println("The strings are completley matched");
	}
		else {System.out.println("The strings are completley matched");
		}
		}
}
