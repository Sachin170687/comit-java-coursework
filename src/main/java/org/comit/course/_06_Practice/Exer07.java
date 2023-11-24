package org.comit.course._06_Practice;

/*7.Write a Java program to create a class called "Employee" with a name, job title, salary attributes,
 *  a parameterized constructor and methods to retrieve and update the salary.
 */


class Employee{
	String name;
	String title;
	double salary;
	
	Employee(String name, String title, double salary) {
		super();
		this.name = name;
		this.title = title;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, title=%s, salary=%s]", name, title, salary);
	}
	
	
}




public class Exer07 {

	public static void main(String[] args) {
		
		
		Employee emp=new Employee("John","Manager",100000);
		
		System.out.println(emp);
		
		emp.setSalary(1_10_000);
		System.out.println(emp);

	}

}
