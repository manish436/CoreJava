package com.hcl.learn.controlFlows;

//******************* If control flow statement ******************************************************************//
// Rule 1. If can take boolean value
// Rule 2. it should not have unreachable statements like
// some statement after return statement is unreachable

//******************* Switch statement ******************************************************************//
// Rule 1. Switch statements should have case statements.
// Rule 2. No need of  break statement with any case.
// Rule 3. Break statement in switch stop the process to running all the cases.
// Rule 4. Default block need not to be last case.
// Rule 5. No need of break with default case also.

// Switch exression
// Rule 6. Switch expression case accept only:
// 1. final  Integer(multiple conditions/byte/short/char/wrapper classes but no long) value.
// 2. With java 7 string can be passed.
// 3. Enum

// Case label
// Rule 7. Must be a range of data type of switch expression
// Rule 8. Constant expression: must be known at compile time
// Rule 9. Value must be unique.
// Rule 10. Cannot be null.

// Good practice to use break; statement.
// Switch is faster then if.

//******************* Ternary Operator ******************************************************************//
// Rule 1. it only accept boolean expression
// result = (boolean-expression) ? true-expr : false-expr;

//******************* for Statement ******************************************************************//
// Rule 1. We can have multiple declaration but of same type only.
// for (int i = 0, j =3, p =10; condition; i++)
// Rule 2. Can have multiple increment/decrement variables.
// Rule 3. we can have print statement in initialization & increment block.

//******************* for Each Statement ******************************************************************//
// Item 46: Prefer for-each loops to traditional for loops.
// When not to use.
// 1. Doing increment and decrement parallelly  
// 2. when doing parallel iteration( multiple arrays)
// 3. backward direction iteration.
// 4. Filtering 

//******************* Labeled Break ******************************************************************//
// Normal break just breaks only that particular inner loop for that condition.
// Labeled Break: breaks the loop which is labeled.

//******************* Continue ******************************************************************//
// It skips that particular inner loops.
// Rule 1.Only works with loops.

//******************* Labeled Continue ******************************************************************//
//It skips that particular inner loops.

public class ControlFlowStatements {
	public static final int constant = 12;

	static boolean ifStatement() {
		boolean approved = false;

		int age = 27;
		int salary = 60000;
		boolean hasBadCredit = false;

		if (age >= 25 && age <= 35 && salary >= 50000) {
			approved = true;
			System.out.println("age >= 25 && age <= 35 && salary >= 50000");
		} else if (age > 35 && age <= 45 && salary >= 70000) {
			approved = true;
			System.out.println("age > 35 && age <= 45 && salary >= 70000");
		} else if (age > 45 && age <= 55 && salary >= 90000) {
			approved = true;
			System.out.println("age > 45 && age <= 55 && salary >= 90000");
		} else {
			if (age > 55 && !hasBadCredit) {
				approved = true;
				System.out.println("age > 55 && !hasBadCredit");
			}
			System.out.println("else block");
		}

		System.out.println("outside if");
		return approved;
	}

	private static void switchExample() {
		int oldMonth = 2;
		switch (oldMonth) {
		case 2:

			break;
		default:

			// Rule 8
		case ControlFlowStatements.constant:

			break;
		case 4:

			break;

		}

		System.out.println("\nInside switchExample ...");
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("April");
		}
	}

	static int terneryMin(int x, int y) {
		return (x < y) ? x : y;
	}

	static void forStatement() {

		int x = 0;
		int k = x;
		System.out.println(k);

		boolean condition = false;
		for (int i = 0, j = 3, p = 10; condition; i++) {

		}

		int i = 1, j = 2;
		// Rule 2
		for (System.out.println("s"); condition; i++, j--) {

		}

		// Rule 3
		for (System.out.println("s"); condition; System.out.println(i++)) {

		}
	}

	static void whileLoop() {
		int x = 5;
		while (true) {
			System.out.println("Value of x:" + x);
			if (x == 2)
				break;

			x--;
		}
	}

	static void labeledBreak() {

		// Normal break just breaks only that particular inner loop for that condition.
		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 1)
					break;

				System.out.println(" i: " + i + " j: " + j + "; x:" + x++);
			}
		}

		// Labeled Break: breaks the loop which is labeled.
		int num = 0;

		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5)
					break outermost;

				System.out.println(" i: " + i + " j: " + j + "; num:" + num++);
			}
		}

		System.out.println("num: " + num); // prints 55

	}

	
	
	static void labeledContinue() {
		System.out.println("\nInside labeledContinue ...");
		int num = 0;

		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					continue outermost;
				}
				System.out.println(" i: " + i + " j: " + j + "; num:" + num++);
			}
		}

		System.out.println("num: " + num); // prints 55
	}

	public static void main(String[] args) {
//		ifStatement();
//		switchExample();
//		System.out.println(terneryMin(2, 3));
//		forStatement();
//		whileLoop();
//		labeledBreak();
		labeledContinue();

	}

}
