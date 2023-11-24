package org.comit.course._05_Practice;

import java.util.Scanner;

/*3.Write a program in Java that reads two numbers from the keyboard and says which is the largest 
 * and which is the smallest.
 */

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the first Numeber");
		int num1=scan1.nextInt();
		System.out.println("Enter the second Numeber");
		int num2=scan2.nextInt();
		if(num1>num2) {
			System.out.printf("%d is largest",num1);
			System.out.printf("%d is smallest",num2);
		}
		else {
		System.out.printf("%d is largest %n ",num2);
		System.out.printf("%d is smallest %n",num1);
	}

}}
