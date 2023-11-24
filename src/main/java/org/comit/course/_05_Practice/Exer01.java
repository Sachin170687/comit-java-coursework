package org.comit.course._05_Practice;

import java.util.Scanner;

/*
1.	Write a program in Java that reads an integer from the keyboard and sums all the 
following 100 numbers, including the number given, showing the result on the screen.
*/
public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		int i=scan.nextInt();
		int count=0;
		int sum=0;
		
		while(count<=100) {
			
			 sum=sum+i;
			 i++;
			 count++;
			
		}
		System.out.println("Total Sum :"+sum);
	}

}

