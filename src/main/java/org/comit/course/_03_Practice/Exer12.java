package org.comit.course._03_Practice;

import java.util.Arrays;

public class Exer12 {

	public static void main(String[] args) {
		
		int[] array= {6,7,4,9,3,2};
		int[] array2= new int[10];
		int size=12;
		int[] array3= new int[size];
		for(int num:array) {
			
			System.out.println(num);
			
	}
		
		System.out.println(array[4]);
		System.out.println(array.length);
		System.out.println(array[array.length-1]);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
		/*for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		*/
		for(int i=0;i<array.length-1;i++) {
			System.out.println(array[i]);
			
			
		}
	
	
	}
	
}
