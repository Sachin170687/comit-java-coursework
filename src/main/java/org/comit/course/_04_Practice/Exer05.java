package org.comit.course._04_Practice;

import java.util.Arrays;

/*5.Write a Java program to find the maximum and minimum values in the array.
 * 
 */
public class Exer05 {

	public static void main(String[] args) {
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Minimum Value :"+array[0]);
		System.out.println("Maximum Value :"+array[array.length-1]);
	}
}
