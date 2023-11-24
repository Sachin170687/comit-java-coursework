package org.comit.course._03_Practice;

/*5.Write a Java program for the following scenario: A student will not be 
 * allowed to sit in an exam if his attendance is less than 75%. Given the 
 * number of classes held and the number of classes attended, print out the 
 * percentage of classes attended and whether the student is allowed to sit in 
 * the exam or not.
 */

	

public class Exer5 {

	public static void main(String[] args) {
	
		int classesHeld = 9;
		double classesAttented = 6;
		
		
		double per=(classesAttented/classesHeld)* 100 ;
		
		
		
		System.out.printf("Percentage of classes attended %.2f%% %n",per);
		
		
		if (per<75) {
		
		System.out.println("The student is not allowed to sit");
		
		}
		else {
			
			System.out.println("The student is allowed to sit");
		}

		
		
		
		
		
	}

}
