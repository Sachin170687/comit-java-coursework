package org.comit.course._04_Practice;

/*7.Write a Java program to find the number of even and odd integers in the array.
*/

public class Exer07 {

	public static void main(String[] args) {
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int i=0;
		int num1=0;
		int num2=0;
		for(i=0;i<=array.length-1;i++) {
			
			
			if (array[i]%2==0) {
			num1++;			}
		
			else { num2++;
		
			}
			
		}
		System.out.println("The Number of even integers : "+num1);
		System.out.println("\"The Number of odd integers :"+num2);
	}
}
