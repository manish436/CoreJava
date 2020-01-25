package com.hcl.learn.VariablesOpertorsArrays;

// Arithmetic operators
// Pre post notations.

// Rule 1. Multiplicative operator (*, /, %) have higher precedence over additive operators(+,-)
// Rule 2. Operator in same group are evaluated from lift to right
// Rule 3. Can use parenthesis to change the evaluation order

// Operand Promotion
// Rule 1. Before any operation (addition or substractor or any other) variable will be promoted and then operation will be performed. 
// like: byte + byte + int then these bytes will be promoted to int first before operation.
// like: 'a' + 'b' so char will be promoted to int 97+98 so final result will be 195.

public class Operators {
	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");

		int x = 5;

		// Pre-order. first increment then assignment
		// --x;
		// System.out.println("x: " + x);

		// Post-order. first assignment then increment
		// int y = x--;
		// System.out.println("y: " + y + ", x: " + x);

		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;
		array[index++] = 20;
		array[index++] = 30;

		System.out.println(index);
	}

	static void compoundArithmeticAssignment() {
		int x = 100;

		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));

		// Invalid
		System.out.println("x =+ 5: " + (x = +5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x = -5)); // Unary minus ~ x = -5

		// System.out.println("x =* 5: " + (x =* 5));
		// System.out.println("x =/ 5: " + (x =/ 5));
		// System.out.println("x =% 5: " + (x =% 5));

	}

	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}

	// Operand Promotion operation
	static void charTypePromotion() {
		System.out.println("\nInside charTypePromotion ...");
		char char1 = 50; // Will be assigned corresponding UTF16 value 2
		System.out.println("char1: " + char1);
		System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50
																// in UTF16 is used
		System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints
		System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' & 'b' are promoted to ints and the respective
	}

	public static void main(String[] args) {
		preAndPost();
		compoundArithmeticAssignment();
		isOddOrEven(51);
	}
}
