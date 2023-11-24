package org.comit.course._02_Practice;

/*9.Write a Java program that, given the radius of a circle, calculates and prints out the area 
and perimeter of the circle.
*/
public class Exer9 {

	public static void main(String[] args) {
	
		double radius=7.5;
		double pi=3.14;
		
		double area=pi*radius*radius;
		double perimeter=2*pi*radius;
		
		System.out.println("Area:"+area+" "+"Perimeter:"+perimeter);

	}

}
