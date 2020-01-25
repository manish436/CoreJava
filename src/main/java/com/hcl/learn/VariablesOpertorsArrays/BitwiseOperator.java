package com.hcl.learn.VariablesOpertorsArrays;

// Theory: Work on individual bits of operands
// Approach(how it works): Integer  -> binary -> binary operation -> output
// operands can be Primitive Integer or Boolean
// Always force JVM to check both the operands(left & right), thus called "Non-short circuit Operator"
// Operand promotion also works with bitwise operator.
// Integer operand converted into binary representation and then Operated on bit level.

// If Operands are boolean then true =1 and false =0;

//Usages: embedded programming, networking, data compression.
public class BitwiseOperator {

	//
	// Bitwise operators are 4 types of:
	// 1. & AND bitwise
	// 2. | OR
	// 3. ^ XOR
	// 4. ~ NOT

	// Compound Bitwise Assignment
	// operand1 &= operand2;
	static void bitwiseOperators() {
		System.out.println("\nInside bitwiseOperators ...");
		int x = 1;
		int y = 3;

		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));

		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

		// Since bitwise work only on Integer types, following will not compile
		// double d1 = 3.14;
		// double d2 = 5.15;
		// System.out.println("d1 | d2: " + (d1 | d2));
	}

	public static void main(String[] args) {
		bitwiseOperators();
	}

}
