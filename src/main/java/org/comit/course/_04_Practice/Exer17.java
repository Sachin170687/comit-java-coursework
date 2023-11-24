package org.comit.course._04_Practice;

/*17.Write a Java program to check whether the character “z” is happy or not in the 
 * following string. A character is happy when the same character appears to its left 
 * or right in a string.
 */
public class Exer17 {

	public static void main(String[] args) {
		
		String str = "azzlea";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)=='z' && str.charAt(i+1)=='z') {
				System.out.println("the character “z” is a happy character");}
					}
				
			}
			
		}

	
