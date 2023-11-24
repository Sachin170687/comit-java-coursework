package org.comit.course._04_Practice;

/*16.Write a Java program to check whether the following string has duplicate 
 * characters (exclude blank spaces).
 */
public class Exer16 {

	public static void main(String[] args) {
		
		String str = "I love coding in Java";
		
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=str.length()-1;j!=i;j--) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("Duplicate Values Exist");}
				break;
			}
			
		}
	}

}
