package org.comit.course._04_Practice;

/*14.Write a Java program to get the index of all the alphabet characters 
 * in the following string.
 */

public class Exer14 {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog.";
		char ch=0;
		
		for(int i=0;i<=str.length()-1;i++) {
		
		 ch=str.charAt(i);
			
			// System.out.println(str.charAt(i));
			
		 	if(ch!=' ') {
		 		System.out.println(str.indexOf(ch));	
		 		}
		 
			
		}
	}

}
