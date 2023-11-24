package org.comit.course._05_Practice;

import java.util.Scanner;

/*
4.	Write a Java program that reads 10 integer numbers from the keyboard to print the average.
*/
public class Exer04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1=scan.nextInt();
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		System.out.println("Please enter the third number");
		int num3=scan.nextInt();
		System.out.println("Please enter the fourth number");
		int num4=scan.nextInt();
		System.out.println("Please enter the fifth number");
		int num5=scan.nextInt();
		System.out.println("Please enter the sixth number");
		int num6=scan.nextInt();
		System.out.println("Please enter the seventh number");
		int num7=scan.nextInt();
		System.out.println("Please enter the Eigth number");
		int num8=scan.nextInt();
		System.out.println("Please enter the Ninth number");
		int num9=scan.nextInt();
		System.out.println("Please enter the Tenth number");
		int num10=scan.nextInt();
		 
		double avg=(num1+num2+num3+num3+num4+num5+num6+num7+num8+num9+num10)/10;
		
		System.out.println("The average of ten numbers : "+avg);
		

	}

}
