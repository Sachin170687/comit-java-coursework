package org.comit.course._04_Practice;


/*10.Write a Java program to sum the character's ASCII codes of all the 
 * characters in the string.
 */


public class Exer10 {

	public static void main(String[] args) {
	
		String str = "I love coding in Java";	
		
		
		int sum=0;
		
		for (int i=0;i<=str.length()-1;i++) {
			
			sum=sum+(int)str.charAt(i);
		}
		
		System.out.println(sum);

	}

}
