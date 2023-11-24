package org.comit.course._04_Practice;

import java.util.Arrays;

/*6.	Write a Java program to reverse the array.
*/

public class Exer06 {

	public static void main(String[] args) {
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int i=0;
		int j=array.length-1;
		System.out.println(Arrays.toString(array));
		
		while(i<j) {
			
			int t=array[i];
			array[i]=array[j];
			array[j]=t;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(array));
		
		/*for (i=0;i<=array.length-1;i++)
			
			System.out.println(array[i]);
		
		for (j=0;j<=array.length-1;j++) {
			
			System.out.println(array[j]);;
			*/
		}
		
		
	}


