package org.comit.course._06_Practice;

/*5.Write a Java program to create a class called "Book" with attributes for the title, author, and 
 * ISBN, a parameterized constructor and a display() method that prints out the book information. In 
 * another class, create an array of books, add three books, and print the books by looping the array 
 * over.
 */

class Book{
	
	String title;
	String author;
	int isbn;
	

	Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}


	
	void Display() {
		System.out.println("title="+title+" "+"author="+author+" "+"isbn="+isbn);
		
	}
		
}


	
	
	
	public class Exer05 {

		public static void main(String[] args) {
			
			Book[] booksArray=new Book[3];
			
			Book b1=new Book("Title 1","Author 1",1);
			Book b2=new Book("Title 2","Author 2",2);
			Book b3=new Book("Title 3","Author 3",3);
			
			
			booksArray[0]=b1;
			booksArray[1]=b2;
			booksArray[2]=b3;
			
			for(Book num:booksArray) {
				num.Display();
			}
			
			
			
			
			
			
			
	
	
}
}