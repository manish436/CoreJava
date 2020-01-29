package com.hcl.learn.staticFinalKeywords;

import java.util.HashMap;
import java.util.Map;

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

//****** Static Initializer **********************************//
//Rule 1. Static block always get executed before static method.
//Rule 2. Static block cannot return a value.
//Rule 3. Static block cannot be called explicitly.
//Rule 4. Static block cannot throws an exception.
//Rule 5. The this and super keywords cannot be used inside the static block.
//Rule 6. If a class have multiple blocks then they will execute in the same order as they written.

/// When a static initializer block can be used?
// 1. If you’re loading drivers. For ex, Class class has a static block where it registers the natives.
// 2. If you need to do manipulation in order to initialize your static variables, you can declare a static block which gets executed exactly once, when the class is first loaded.
// 3. If you need a Map with static values.
// 4. If you need some common values like server url, IP address at very beginning of the program.
// 5. Security related issues or logging related tasks.

//****** Instance Initializer **********************************//
// 1. The instance initializer block is created when instance of the class is created.
// 2. Compiler copied all Instance Initializer into constructor.
// 3. The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call)
// 4. Instance Initializer code get shared by multiple constructor.
// 5. The instance initializer block comes in the order in which they appear.

public class StaticKeywords {
	// variable declarations
	private int studentCount;
	// private static int studentCount;

	static Map<String, String> myMap = new HashMap<>();

	// instance initializer: copied all Instance Initializer into constructor.
	public StaticKeywords() {
		studentCount++;// with every object creation will start from 0, but will not preserve, to do
						// that we have to make it static.

		System.out.println("Inside no-arg constructor ...");
	}

	public StaticKeywords(int id) {
		System.out.println("Inside constructor with a parameter ...");
	}

	{
		System.out.println("Inside instance initializer ...");
	}

	//

	static int number;// no need to initialize
	int instanceVar;
	static int staticVar;
	static {
		System.out.println("single line");
	}

	static {
		myMap.put("firstKey", "firstValue");
		myMap.put("secondKey", "secondValue");
		myMap.put("thirdKey", "thirdValue");

		try {
			number++;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

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
