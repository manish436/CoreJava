package com.hcl.learn.boxingUnboxing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// "Boxing" : Conversion of primitive data types into its equivalent Wrapper type.
// "UnBoxing": Conversion of Wrapper type into primitive data types.
// "AutoBoxing & UnBoxing": Automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is 
// 							known as unboxing.

// java.lang
//--------------------------------------
//| Primitive Type 	|	Wrapper class	|
//| boolean		   	| Boolean			|
//| char			| Character			|
//| byte			| Byte				|
//| short			| Short				|	
//| int			 	| Integer			|
//| long			| Long				|
//| float			| Float				|
//| double		 	| Double			|
//---------------------------------------

// Use of wrapper classes:
// 1. Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. 
// But, if we convert the primitive value in an object, it will change the original value.
// 2. Serialization: Usages Wrapper class through autoboxing, we can do explicitly too.
// 3. Collection Framework 
// 4. Generics 

public class BoxingUnboxing {

	public static void primitiveToWrapper() {
		int a = 20;
		// simple factory mean object creation.
		// better performance due to internal caching byt valueOf();
		Integer aWrapper = Integer.valueOf(a);// converting int into Integer explicitly
	}

	public static void wrapperToPrimitive() {
		Integer aWrapper = new Integer(3);

		int a = aWrapper.intValue(); // converting Integer to int explicitly
	}

	public static void autoBoxingWithCollection() {
		char ch = 'a';
		// Autoboxing- primitive to Character object conversion
		Character a = ch;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Autoboxing because ArrayList stores only objects
		arrayList.add(25);
		
		//AutoBoxing does not works with Arrays
		//Integer[] items = new int[] {1,2}; // Compiler error, does not perform autoboxing as it can be a performance issue.
		Integer[] items = new Integer[] {new Integer(1), new Integer(2)};
		
	}

	public static void stringToAndFrom() {
		// String to other data type
		int n = Integer.parseInt("25");

		// Data type to String
		String s = Integer.toString(25);
	}

	public static void minMaxValuesOtherMethod() {
		// Box/Wrapper classes also provides min and max and other static methods.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.isLetterOrDigit(25));
		System.out.println(Double.isNaN(2.32));
	}

	public static void main(String[] args) {

		minMaxValuesOtherMethod();

		// Serialization example
		try {
			int i = 10;
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(new Integer(i));
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			int s = (int) in.readObject();
			// printing the data of the serialized object
			System.out.println(s);
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
