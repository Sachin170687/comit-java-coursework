package org.comit.course._06_Practice;


/*4.Write a Java program to create a class called "Circle" with a radius attribute. You can access 
 * and modify this attribute. Create methods to find the area and circumference of the circle. 
 * Create an object of “Circle”, set a value for the radius and display the area and circumference. 
 */


class Circle {
	 int r;
	 
	 double Area(int r) {
		 double ar=3.14*r*r;
		 return ar;
	 }
	 
	 double Perimeter(int r) {
		 double pr=2*3.14*r;
		 return pr;
	 }
	
}


public class Exer04 {

	public static void main(String[] args) {
		
	
		Circle c1=new Circle();
		double area=c1.Area(4);
		double perimeter=c1.Perimeter(4);
		System.out.println(area);
		System.out.println(perimeter);
	}

}
