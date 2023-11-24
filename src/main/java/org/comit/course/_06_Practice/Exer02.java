package org.comit.course._06_Practice;

/*2.Write a Java program to create a class called "Dog" with a name and breed attribute. 
 * Create two instances of the "Dog" class, set their attributes using the constructor, modify 
 * them using the setter methods and print the updated values.
 */
class Dog{
	String name;
	String breed;
	
	void Display() {
		System.out.println(name);
		System.out.println(breed);	
	}
	
	
	
	
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}

public class Exer02 {

	public static void main(String[] args) {
		
	/*	Dog dog1= new Dog();
		dog1.name="Buddy";
		dog1.breed="Labrador";
		dog1.Display();
		dog1.setBreed("Eskimo Dog");
		dog1.setName("Mouse");
		dog1.Display();
	*/
		
		
		Dog dog2=new Dog("Togo","Alaskian Malamute");
		dog2.Display();
		dog2.setName("Toby");
		dog2.setBreed("French Bulldog");
		dog2.Display();
	
	}

}
