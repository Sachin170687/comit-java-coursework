package org.comit.course._07_Practice;

class Person {
	
	String name;
	int age;
	
	void display() {
		System.out.println("Name :-"+name+"    "+"Age :-"+age);
		
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

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
	
	
	
}


class Employee extends Person{
	
	int id;
	String position;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	void display() {
		System.out.println("ID :-"+id+"   "+"Name :-"+getName()+"    "+"Position :-"+position+"   "+"Salary :-"+salary+"  "+"Age :-"+getAge());
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, position=%s, salary=%s, name=%s, age=%s]", id, position, salary, name,
				age);
	}
	
		
}


class Customer extends Person{
	
	int custid;
	String custcode;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustcode() {
		return custcode;
	}
	public void setCustcode(String custcode) {
		this.custcode = custcode;
	}
	
	
	
}





public class Inheritance {

	public static void main(String[] args) {
		
		Person per=new Person();
		per.name="John";
		per.age=25;
		
		per.display();
		System.out.println(per.toString());
		System.out.println(per);
		
		Employee emp=new Employee();
		
		emp.setId(234);
		emp.setName("Smith");
		emp.setPosition("Manager");
		emp.setSalary(80_000);
		emp.setAge(30);
		
		emp.display();
		System.out.println(emp.toString());
		System.out.println(emp);
		
		Customer cust=new Customer();
		
		cust.setCustid(2345);
		cust.setName("Jane");
		cust.setCustcode("CHGF");
		cust.setAge(37);
		
		System.out.println(cust);
		
		
	}

}
