package com.hcl.learn.ConstructorAndOverLoading;

//Rule 1. Must change parameter list
//# Parameter or Parameter type or both must be changed.
//Rule 2. Changing return type does not matter
//Rule 3. Both Static and Instance methods can be overloaded
//Method binding will be discussed later
public class MethodOverLoading {
	static void go(int[] array) {
		System.out.println("go(int[] array)");
		array[1] = 11;
	}

	static void go(int i) {
		System.out.println("go(int i)");
	}

	static void go(short s) {
		System.out.println("go(short s)");
	}

	public static void main(String[] args) {
		go(1000);
		byte b = 22;
		go(b);
	}

}
