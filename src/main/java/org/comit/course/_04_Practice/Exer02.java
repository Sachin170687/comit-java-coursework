package org.comit.course._04_Practice;

/* 2.Write a Java program to calculate the average value of the array elements. Print out the 
 * average value.
 */


public class Exer02 {

	public static void main(String[] args) {
		
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int sum=0;
		double avg=0;
		
		for (int i=0;i<=array.length-1;i++) {
			
			sum=sum+array[i];
		}
		
		avg=(double)sum/array.length;
		
		System.out.println("The Average of array :- "+avg);	

	}

}
