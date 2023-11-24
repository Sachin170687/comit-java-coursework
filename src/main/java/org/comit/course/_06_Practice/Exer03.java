package org.comit.course._06_Practice;

/*3.Write a Java program to create a class called "Rectangle" with width and height attributes. 
 * Create a parameterized constructor and two methods that find the area and perimeter of the 
 * rectangle. Create an object of “Rectangle” and display the area and perimeter. 
 */

class Rectangle{
	
	int width;
	int height;
	
	
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	int Area(int width,int height) {
		
		int ar=width*height;	
		return ar;
	}
	
	int Parameter(int width,int height) {
		
		int pr=2* width + height * 2;	
		return pr;
	}
	
	
	
	
}



public class Exer03 {

	public static void main(String[] args) {
		
	
		Rectangle rect=new Rectangle(2,2);
		
		int area=rect.Area(2, 2);
		int para=rect.Parameter(2, 2);
		
			System.out.println(area);
			System.out.println(para);
		
		
		
		
	}
}
