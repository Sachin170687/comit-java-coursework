package org.comit.course._06_Practice;


/*1.Write a Java program to create a class called "Person" with a name and age attribute. 
 * Create two instances of the "Person" class, set their attributes using a constructor, and 
 * print their name and age.
 */

class Person{
	String name;
	int age;
	
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
   
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}


	

	    public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




		String Seniority(int age) {
		String sen="";
		
		if(age >30) {sen="Senior";}
		else {sen="Junior";}
		return sen;
	}
	
	
}

public class Exer01 {

	public static void main(String[] args) {
		
/*
		Person per1=new Person();
		
		per1.name="Sachin";
		per1.age=40;
		
		per1.display();
		
		String seni1=per1.Seniority(40);
		System.out.println(seni1);
		
		Person per2=new Person();
		per2.setName("Kumar");
		per2.setAge(32);
		per2.display();
		
		String seni2=per1.Seniority(32);
		System.out.println(seni2);
		
		
		Person per3=new Person();
		per3.setAge(25);
		per3.setName("Arya");
		per3.display();
		
		String seni3=per3.Seniority(34);
		System.out.println(seni3);
		
	*/
		
		Person per4=new Person("Aryan",35);
		per4.display();
		String seni4=per4.Seniority(35);
		System.out.println(seni4);
		
	}

}
