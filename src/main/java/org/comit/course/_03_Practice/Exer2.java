package org.comit.course._03_Practice;

/*2.Write a Java program that, given three numbers, prints out the 
 * greatest number.
 */
public class Exer2 {

	public static void main(String[] args) {
	
		int num1 = 48;
		int num2 = 12;
		int num3 = 37;

		if (num1>num2 && num1>num3) {
			
			System.out.println("Greatest Number is:"+num1);
			}
		else if (num2>num1 && num2>num3) {
			
			System.out.println("Greatest Number is:"+num2);
			}
		else if (num3>num1 && num3>num1) {
			
			System.out.println("Greatest Number is:"+num2);
			}
		
	}

}
