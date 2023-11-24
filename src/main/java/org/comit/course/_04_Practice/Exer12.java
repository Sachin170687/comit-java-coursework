package org.comit.course._04_Practice;

/*
 * 12.	Write a Java program to reverse the string.
 */
public class Exer12 {

	public static void main(String[] args) {
		String str = "I love coding in Java";	
		char ch;
		String revstr="";
		
		/*int i=0;
		int j=str.length()-1;
		
		while (i<j) {
			char rstr=str.charAt(i);
		    str.charAt(i)=str.charAt(j);
			str.charAt(j)=rstr;
			
		}
	
		*/
			
			System.out.println(str);
			
		
        for (int i=0;i<=str.length()-1;i++) {
			ch=str.charAt(i);
			
			revstr=ch+ revstr ;
			
        }
		
        System.out.println(revstr);
		
		
	}
}
