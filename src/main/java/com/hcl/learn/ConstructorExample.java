package com.hcl.learn;

/* Theory: */

// 1. Runs on object creation
// 2. Used to initialize Object State
// 3. After crating object in memory constructor being called, with below quoted "text"
// Student st = new "Student();"

//Rule 1. Constructor must have same name as class.
//Rule 2. It can optionally have parameters
//Rule 3. It does not have return type.
//Rule 4. Constructor can be overloaded.
//Rule 5. Constructor can have no value return statement.

/* Rule for "this" keyword */
//Rule 1. If we are using "this" keyword in Constructor then it should be very first statement of Constructor code.
//Rule 2. "this" can only be used ones per constructor.
//Rule 3. Can not use instance variables as argument in "this", as object yet not initialized.
//Rule 4. can not have recursive invocation otherwise it will lead to infinite loop. //Example: Two Constructor calling each other
//Rule 5. Can not use "this" keyword from "static methods" as static method as class methods not instance methods.

//Action 1.  If we do not create Constructor(with or without params) then compiler create it for us internally with no-args.

//Example:  
public class ConstructorExample {
	int id;
	String name;
	int salary;

	ConstructorExample(int userId, String name) {
		id = userId;
		this.name = name; // This" keyword used for hiding(shadowing) instance variable by local variable
		return; // Constructor can have no value return statement.
	}

	ConstructorExample(int userId, String userName, int userSalary) {
		this(userId, userName);// use of "this" keyword.
		salary = userSalary;
	}

	public static void main(String[] args) {
		ConstructorExample student = new ConstructorExample(1002, "Dheeru");// Does not have salary
		ConstructorExample instructor = new ConstructorExample(1002, "Dheeru", 50000);
		System.out.println("Name: " + instructor.name);
	}

}
