package org.comit.course._07_Practice;


class Pers {
	
	String name="sach";
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

	String pension(int age) {
		if(age>30) return "true";
		else return "false";
	}

	

	
	
}




public class Inherit {

	public static void main(String[] args) {
		
		Pers per=new Pers();
		per.setName("Tom");
		per.setAge(40);
		per.pension(40);
		System.out.println(per.getName()+" "+per.pension(40)+" "+per.getAge());
	
		System.out.println(per.name);
		
	}

}
