package org.comit.course._05_Practice;

import java.util.Scanner;

/*2.Write a program in Java that converts from Canadian dollars to US dollars. You will get a decimal 
 * number corresponding to the amount in CAD from the keyboard and print out an answer with the 
 * corresponding amount in US dollars. Use today’s exchange rate. Note: Use the scanner class to 
 * get the User input.
 */
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double usd=0;
		System.out.println("Enter the Canadian Dollar");
		double cad=scan.nextDouble();
		usd=cad*1.36;
		System.out.println("The Amount in US Dollar :"+usd);
	}

}
