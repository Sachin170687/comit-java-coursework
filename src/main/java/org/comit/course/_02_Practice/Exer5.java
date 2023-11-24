package org.comit.course._02_Practice;

/*5.Write a Java program to print out the values of 
 * the following expressions:
 */

public class Exer5 {

	public static void main(String[] args) {
		
		double  exp1=(double)(101+0)/3;
		double  exp2=3.0e-6 * 10000000.1;
		boolean exp3=true && true;		
		boolean exp4=false && true ;	
		boolean exp5=(false && false ) || (true && true);
		boolean exp6= (false || false) && (true && true );
		
		System.out.println("The value of first expression:"+exp1);
		System.out.println("The value of second expression:"+exp2);
		System.out.println("The value of third expression:"+exp3);
		System.out.println("The value of fourth expression:"+exp4);
		System.out.println("The value of fifth expression:"+exp5);
		System.out.println("The value of sixth  expression:"+exp6);
	}

}
