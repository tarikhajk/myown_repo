package book_borrowing;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;


	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

}
