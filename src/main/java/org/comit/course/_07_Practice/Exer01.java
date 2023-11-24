package org.comit.course._07_Practice;

/*1.Write a Java program to create a class called "Helper" with three overloaded methods. The method 
 * name is formatNumber(). The first method receives an int and returns it converted into a String. 
 * The second method takes a double, formats the number with 3 decimal places and returns it as a 
 * String. The third method takes a String (the String contains a decimal number), formats the number 
 * with 2 decimal places and returns it as a String.
 */


class Helper{
	
	String formatNumber(int num){
		String str=String.format("%d", num);
		return str;
	}
		String formatNumber(double num1){
			String str1=String.format("%.5f", num1);
			return str1;
	}

		String formatNumber(String num2){
			String str2=String.format("%.3f", num2);
			return str2;
	}
	
		
	
	}




public class Exer01 {

	public static void main(String[] args) {
		
		Helper obj1=new Helper();
		Helper obj2=new Helper();
		
		String Str1=obj1.formatNumber(123);
		System.out.println(Str1);
		
		String Str2=obj1.formatNumber(23.45678);
		System.out.println(Str2);
		
		String Str3=obj2.formatNumber(23.45678);
		System.out.println(Str3);
		
	}

}
