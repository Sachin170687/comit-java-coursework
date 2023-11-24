package org.comit.course._04_Practice;


/*1.	Write a Java program to sum the values of the array. Print out the sum.  
*/
public class Exer01 {

	public static void main(String[] args) {
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int sum;
		
		sum=0;
		for (int i=0;i<=array.length-1;i++) {
			
			sum=sum+array[i];
		}

		System.out.println("The sum of array :- "+sum);
	}

}
