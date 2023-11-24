package org.comit.course._04_Practice;

/*3.Write a Java program to test if the array contains the value 5. Print out a message 
 * indicating if the value was found.
 */

public class Exer03 {

	public static void main(String[] args) {
		
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int searchElement=5;
		boolean flag=false;
		
		for(int i=0;i<=array.length-1;i++) {
			
			// System.out.println(array[i]);
			if(searchElement==array[i]) {
				System.out.println("Element is found at position :- "+i);
				flag=true;
				break;
			}
			
		}
			if (flag==false) {
				
				System.out.println("Element is not found ");
				
			}
			
		}

	}


