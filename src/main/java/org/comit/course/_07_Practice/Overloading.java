package org.comit.course._07_Practice;



class Myclass{
	
	String str;
	int num;
	
	// Constructors
	
	Myclass(String str) {
		super();
		this.str = str;
	}


	Myclass(int num) {
		super();
		this.num = num;
	}


	Myclass(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}
	
	Myclass(int num,String str) {
		super();
		this.str = str;
		this.num = num;
	}
	
	
	Myclass(long num) {
		super();
		this.num = (int)num;
	}

	// Methods
	
	String concat(String str,int num) {
		return "Method - 1"+" "+str+" "+num;	
	}
	
	String concat(int num,String str) {
		return "Method - 2"+" "+str+" "+num;	
	}
	
	String concat(int num) {
		return "Method - 3"+" "+num;	
	}
	
	String concat(String str) {
		return "Method - 4"+" "+str;	
	}
	String concat(long num) {
		return "Method - 5"+" "+num;	
	}
	
	int add(int a,int b,int c) {
		return (a+b+c);	
	}
	int add(int a,int b) {
		return a+b;	
	}
	
	
}




public class Overloading {

	public static void main(String[] args) {
		
		Myclass obj1=new Myclass("Year");
		Myclass obj2=new Myclass(2023);
		Myclass obj3=new Myclass("Year",2023);
		Myclass obj4=new Myclass(2023,"Year");
		
		
		System.out.println(obj1.concat("Year"));
		System.out.println(obj1.concat(2023));
		System.out.println(obj1.concat(2023,"Year"));
		System.out.println(obj1.concat("Year",2023));
		System.out.println(obj1.add(2,2,2));
		System.out.println(obj1.add(2,2));
	}

}
