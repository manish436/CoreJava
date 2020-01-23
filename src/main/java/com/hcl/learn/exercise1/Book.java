package com.hcl.learn.exercise1;

//Constructor Overloading and using this keyword example.
public class Book {
	public String title;

	public Book(String title) {
		this.title = title;
	}

	// your code (optional ~ you can avoid it. Depends on your implementation in
	// Instructor)

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}