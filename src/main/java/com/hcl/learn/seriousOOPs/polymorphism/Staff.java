package com.hcl.learn.seriousOOPs.polymorphism;

public class Staff extends User {
	public int id = 2;
	
	public Staff() {
		System.out.println("asdasd");
		//super(); calling super() constructor must be the first statement. Rule 2.
		//this(); must be the first statement. Rule 3.
	}

	public void printUserType() {
		System.out.println("Staff...");
		// Rule 2. super keyword to access parent class method can be used in "any line"
		// of child class method, not need to be first statement as constructor.
		super.printUserType();
	}

	// As Staff posting review do not need any approval.
	@Override
	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}

	// Can not use "super" in static method.
	public static void staticMethod() {
		// super.postAReview(); compiler error
	}
}