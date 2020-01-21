package com.hcl.learn;

public class VariablesAndDataTypes {
	// Adapted from
	// http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
		System.out.println(); // Print empty line
		System.out.print("Hello, world!!"); // Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" "); // Print a space
		System.out.print("world!!");
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ...");
		// literals demo
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intChar = 'A'; // holds decimal equivalent, which is 65
		System.out.println("intChar: " + intChar);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);

		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowdByte: " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int
								// --> char)
		System.out.println("cChar: " + cChar);
	}

	static void arrays() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 11, 2, 5, 4, 4, 6 };
		System.out.println("myArray.length: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
		System.out.println("myArray[7]: " + myArray[6]);
	}

	static boolean search(int[] list, int key) {
		return true;
	}

	public static void main(String[] args) {
		// Language Basics 1
		// print();
		// primitives();
		// typeCasting();
		arrays();
		int[] anArray = { 32, 43, 12 };
		// anArray = { 32, 43, 12 }; not allowed.

		// search({21,31}, 21); //not allowed
		search(new int[] { 21, 31 }, 21);

		// JAVA is pass by value not pass by refrence
		int id = 1000;
		Student st = new Student();
		st.newId = 1000;

		updateId(id, st);
		System.out.println("Dones not change id:" + id);
		System.out.println("But change refrence object:" + st.newId);

		// Array in JAVA is also pass by reference like objects
		int[] array = { 1, 2 };
		goArray(array);

		System.out.println("Array will be affected:" + array[1]);
	}

	static void updateId(int newId, Student st) {
		newId = 1001;
		st.newId = 1001;
	}

	static void goArray(int[] array) {
		array[1] = 22;
	}
}

class Student {
	int newId;
}