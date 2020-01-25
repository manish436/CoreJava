package com.hcl.learn.VariablesOpertorsArrays;

// Arithmetic operators
// Pre post notations.

// Rule 1. Multiplicative operator (*, /, %) have higher precedence over additive operators(+,-)
// Rule 2. Operator in same group are evaluated from lift to right
// Rule 3. Can use parenthesis to change the evaluation order

// Operand Promotion
// Rule 1. 
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

	public static void main(String[] args) {
		preAndPost();
		compoundArithmeticAssignment();
		isOddOrEven(51);
	}
}
