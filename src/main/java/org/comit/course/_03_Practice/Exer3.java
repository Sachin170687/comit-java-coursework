package org.comit.course._03_Practice;


/*3.Write a Java program that, given a year, prints out whether it is 
 * a leap year or not.
 */

public class Exer3 {

	public static void main(String[] args) {
		
		int year=1995;
		
		
		if (year%4==0 && year%100!=0) {
			
			System.out.println("It's a Leap Year");	
		}
		
		else if (year%4==0 && year%100==0) {
			
			if (year%400==0) {
			System.out.println("It's a Leap Year");
			}
			else  {
				System.out.println("It's not a Leap Year");
				}
			}
		else  {
			System.out.println("It's not a Leap Year");
		}
	}
}
		
	


