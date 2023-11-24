package org.comit.course._03_Practice;

/*4.Write a Java program for the following scenario: A company decides to give a
 *  bonus of 5% to the employees if their years of service are more than 5 years. So, given a number 
 *  of years of service and a salary, print out the bonus.
 */
public class Exer4 {

	public static void main(String[] args) {
		int years = 8;
		double salary = 65000;
		
		if (years>5) {
			
			double bonus=salary*.05;
			
			System.out.println("Bonus:"+bonus);
		}
		 else {
			
			
			System.out.println("No Bonus");
		}


		double bonus= (years>5) ? salary*.05 : 0;
		
		System.out.println("The Bonus is :-"+bonus);
		
	}

}
