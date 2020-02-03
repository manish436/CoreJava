package com.hcl.learn.seriousOOPs.polymorphism;

public class User {
	
	public User() {
	}
	
	public void printUserType() {
		System.out.println("User");
	}

	public void saveWebLink() {
		System.out.println("User: saveWebLink");
		// postAReview();
	}

	//When normal user post a review that should be approved.
	public Review postAReview(String reviewText) {
		System.out.println("User: postAReview");
		Review review = new Review(reviewText);
		return review;
	}
}