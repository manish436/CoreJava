package com.hcl.learn;

//Rule 1. This Parameter can take variable no. of Argument, it can take 0, 1 or more then 1 Parameter with commas.
//Rule 2. last Parameter can be of VarArg type. 
//Rule 3. A method can only have 1 vararg parameter.
//Rule 4. It can be the only parameter of method.
//Rule 5. In case of bunch of overloaded method, vararg method will be matched last.

//Action 1. Compiler complies vararg to an array
//Action 2. We can replace main(String[] args) method with main(String... args)

//Example: printf is an example of vararg.
// System.out.printf(format, arguments); => System.out.printf("DOB %d/%d/%d", 1,1,1998);

public class VariableArguments {
	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("\nInside varargsOverload without varargs ...");
	}

	static void varargsOverload(boolean b, int... list) {
		System.out.println("\nInside varargsOverload with varargs ...");
		System.out.println("list.length: " + list.length);
	}

	public static void main(String[] args) {
		varargsOverload(true, 1, 2, 3);// First try to find exact match.
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);// will go for vararg method.
		varargsOverload(true);// no option, it will go to vararg method.
	}
}
