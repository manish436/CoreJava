package com.hcl.learn.statickeywords;

//****** Static Method **********************************//
// Rule 1. Static methods can not access instance variable/method.
// Rule 2. Static methods can access static  variables.
// Rule 3. Static methods can access other static  methods.
// Rule 4. Can be invoked using ClassName.methodName();
// Rule 5. Can be accessed using object/refrence of object, like studentObj.staticMethod(), but leads to misleading code.

// It saves heap space.

// Item 4: Enforce noninstantiability with a private constructor, like Math class.
// public final class Math {
/**
 * Don't let anyone instantiate this class.
 */
// private Math() {}
//}

//****** Static Variables **********************************//
// Rule 1. Not necessary to initialize static variable during declaration.
// Rule 2. Static variables can not be declared in method(static/instance).

public class StaticKeywords {
	// variable declarations
	private int studentCount;
	// private static int studentCount;

	public StaticKeywords() {
		studentCount++;// with every object creation will start from 0, but will not preserve, to do
						// that we have to make it static.
	}

	static int number;// no need to initialize
	int instanceVar;
	static int staticVar;

	void instanceMethod() {
		instanceVar++; // it is okay.
		staticVar++; // it is also Okay.
		staticMethod();// it is also okay.
	}

	static void staticMethod() {
		staticVar++;
		// instanceVar++; // Compiler error.
		// instanceMethod(); // Compiler error.
		(new StaticKeywords()).instanceMethod();// it is okay, as accessing with object state.
	}

	static void mathRandom() {
		int as;
		for (int i = 0; i < 20; i++) {
			/*
			 * Math.random always returns 0.SOME_VALUES, so to get numeric number(greater
			 * then 0) we have to multiple with limit number, like in below example we need
			 * number lesser then 6.
			 */
			System.out.println(Math.random() * 6);
		}
	}

	public static void main(String[] args) {
		StaticKeywords.mathRandom();
	}
}
