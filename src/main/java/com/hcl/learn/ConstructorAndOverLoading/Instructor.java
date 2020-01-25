package com.hcl.learn.ConstructorAndOverLoading;

//Constructor Overloading and using this keyword example.
public class Instructor {
	public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;

	// Primary Constructor
	public Instructor(long id, String name, String title, String department, Book[] books) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.department = department;
		this.books = books;
	}

	public Instructor(long id, String name, String title, String department) {
		this(id, name, title, department, null);
	}

	public Instructor(long id, String name, String title) {
		this(id, name, title, null, null);
	}

	public Instructor(long id, String name) {
		this(id, name, null, null, null);
	}

	public String getMostRecentBookTitle() {
		return this.books[this.books.length - 1].getTitle();
	}

	public Book updateBook(int index, String title) {
		// giving copy of old book object, not same object.
		Book oldBook = new Book(this.books[index].getTitle());

		this.books[index] = new Book(title);

		return oldBook;
	}

	public Book updateBook(int index, Book book) {
		Book oldBook = this.books[index];
		this.books[index] = book;

		return oldBook;
	}

	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
		Book book2 = new Book("Scala for Beginners");
		Book book3 = new Book("Effective Python");

		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science",
				new Book[] { book1, book2, book3 });
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());

		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}