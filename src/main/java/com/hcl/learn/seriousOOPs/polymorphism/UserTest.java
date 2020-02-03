package com.hcl.learn.seriousOOPs.polymorphism;

// "Polymorphim"
// Rule 1. Super class reference can hold object of child class.
// i.e. User editor = new Editor();

// Rule 2. In the above statement compiler first checks the method declaration in reference class, like in below example compiler will check approveReview() in User class first.
// i.e. editor.approveReview();// compile time error.

// Rule 3. Calling method from child class with parent class reference will check methods in Inheritance hierarchy(down to top)
// i.e. editor.postAReview(); compiler will check in editor class then in staff and finally in User class. 
// **************************************************************************************//

// "instanceof" Operator
// instanceof operator evaluates left hand side reference(s) must be object of Class(Editor) or its child class only.  
// if (s instanceof Editor)

//**************************************************************************************//

// "Type Safety":
// 1. Static: checking errors at compile time, generic prevents type safety issue mostly.
// i.e. int i = 233.3; // compiler error.
// s.approveReview(); //  compiler error: method not defined.

// 2. Dynamic: Checking error at run time.
// i.e. ArrayIndexoutOf bound
// ClassCastException: s.approveReview();// method only supporting sub class but passing parent class object 

//**************************************************************************************//
// "Overriding": redefining the behavior of superclass method.
// Rule 1. Same parameters + compatible return type(only objects not primitive return types).
// Rule 2. Can't be less restrictive.

// "What can not be overridden"
// 1. final method.
// 2. fields(static/instance).
// 3. Static methods

// "Preventing inheritance": to prevent inheritance we can do following:
// 1. final class: 
// - final keyword can be used with class.
// - final not extendible but instantiable

// 2. private constructor.
// - Neither extendible nor instantiable

//**************************************************************************************//
// "Super" keyword: Used to access super class method from sub class.
// Rule 1. Can't use in static methods.
// Rule 2. super keyword to access parent class method can be used in any line of child class method, not need to be first statement as constructor.
// Rule 3. Can access hidden fields(same name field is defined in sub class) of super class.
// Rule 4. super keyword can be used to access instance variable of parent class.
// Rule 5. super keyword can be used to invoke parent class constructor from child class.

//**************************************************************************************//
// "Constructor Chaining" + "super" keyword:
// Rule 1. In a class hierarchy sub class's constructor invokes parent class's constructor, then  parent class's constructor its class's constructor.
// Rule 2. To call parent constructor super() will be used and that should be the first statement.
// Rule 3. Even this() to call overloaded constructor within the same class should be the first statement.
// Rule 4. this() super() can not be used at the same time in constructor.
// Rule 5. When we do not use super() in constructor then compiler itself adds it for us.
//**************************************************************************************//

//final keyword can be used with class, final not extendible but instantiable.
public final class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}

	public static void main(String[] args) {
		// Part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);

		// "Implicit Casting": As passing Small object Editor to method (printUserType)
		// which can accept Larger object User, so compiler is casting it implicitly.
		ut.printUserType(editor);

		// Part 2
		// Complier check reference first at compile time. Rule 2.
		// editor.approveReview();// Complier error.
		// "Explicit Casting": committing to compiler that we are only calling editor or
		// its sub class methods.
		((Editor) editor).approveReview();

		// editor.postAReview();
		// editor.saveWebLink();

		// "Casting & instanceof"
		UserTest utNew = new UserTest();
		utNew.approveReview(new Staff());
		utNew.approveReview(new Editor());

		// "Overriding" calls the overridden method in staff.postAReview, which then
		// calls User.postAReview using "super" keyword.
		staff.postAReview("This is a review text, which does not need any approval.");

	}

	// "instanceof"
	public void approveReview(Staff s) {
		if (s instanceof Editor)
			((Editor) s).approveReview();
		else
			System.out.println("Invalid object passed!!");
	}
}