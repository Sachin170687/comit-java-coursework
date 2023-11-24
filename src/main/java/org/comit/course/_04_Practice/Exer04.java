package org.comit.course._04_Practice;

/*4.Write a Java program to find the index of value 4 in the array.
 * 
 */
public class Exer04 {

	public static void main(String[] args) {
	
		int[] array={7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		boolean flag=false;
			
		for(int i=0;i<=array.length-1;i++){
				
			if(array[i]==4) {
				
				System.out.println("The postion of 4 :"+i);
				flag=true;
				break;
			}
	}

		if(flag==false) {
			
			System.out.println("The value is not found");
		}
		
	}

}
