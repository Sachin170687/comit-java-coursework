package org.comit.course._05_Practice;

import java.util.Scanner;

/*5.Write a Java program that generates a random number from 1 to 20, giving the user three chances 
 * to guess the number.  Display a message indicating if the user guessed the number. Hint: You 
 * can use the Math library to generate the random number.
 */
public class Exer05 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int min=1;
		int max=20;
		
		int range=max-min+1;
		
		
		
		for(int i=1;i<4;i++) {
			int random=(int)(Math.random()*range)+min;	
			String msg=scan.nextLine();
			System.out.println("User guessed the number");
			System.out.println(random);
			
		}

	}

}
