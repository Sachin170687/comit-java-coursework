package org.comit.course._04_Practice;

/*15.Write a Java program to check whether the first two characters appear at the 
 * end of the following string.
 */
public class Exer15 {

	public static void main(String[] args) {
	
		String str = "educated";
		String str1=str.substring(0, 2);
		String str2=str.substring(str.length()-2);
		
		System.out.println(str.substring(0, 2));
		System.out.println(str.substring(str.length()-2));
		
		if (str1.equals(str2)) {
			System.out.println("Substrings matched");
		}
		else {
			System.out.println("Substrings do not matched");
		}
		
	}

}
