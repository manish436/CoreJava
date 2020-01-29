package com.hcl.learn.staticFinalKeywords;

//******** Final Variables **********************//
// Final: Something that can not be changed.
// Rule 1. Primitive: if it is primitive variable then it is constant.
// Rule 2. Object reference: if it is object then, reference to that object is constant not the content of object.
// Rule 3. Final variable does not get default value.
// Rule 4. Can be used with all these kinds of variables:- instance, local, method parameter, static. 

// Final variable must be initialized in any of following:
// 1. During declaration 
// 2. constructor
// 3. instance initializer block

// ******** Final Static variable(constants) **********************//
// 1. It is known as constant.
// 2. Must be initialized in any of following:
//	- During declaration 
//  - Static initializer block.
// 3. Can be declared @ class level only, not in instance method.

// Good to be declared in CAPS.

// ******** Constant Variables ************************************//
// Rules to become a constant variable.
// Rule 1. final
// Rule 2. primitive or String
// Rule 3. Must be initialized during declaration itself, can not be constructor or initializer block.
// Rule 4. Value must be known as compile time.
// like final z = 5; final p = 5 + z; so p is also constant variable.
// final int x= getVal();// not constant.
public class FinalKeyword {
	final static int monthVariable = 3; // Can be declared @ class level only, not in instance method.

	final int MY_FINAL;

	// Constant
	public static final double PI = 1.32323;
	static final int x;

	public void myMethod() {
		// PI = 2.32; can not be changed.
	}

	static {
		x = 23;// Not a constant variable.
	}

	public FinalKeyword() {
		MY_FINAL = 12; // it not constant variable, as it is defined at runtime while object
						// declaration.
	}

	public void switchWithFinalCases() {
		// Can be declared @ class level only, not in instance method.
		// final static int month3 = 3;

		final int month3 = 3; // it is a constant as it is known as compile time.
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case month3:// final variable
			System.out.println("March");
			break;
		default:
			System.out.println("April");
		}
	}

	// Can be declared @ class level only, not in static method.
	public static void staticMethodWithFinalVariable() {
		// final static int month5 = 3;
	}

}
