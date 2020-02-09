package com.hcl.learn.interfaces;

public abstract class AbstractA implements A {
	public void bar() {
		System.out.println("AbstractA: bar");
	}

	//Can again be defined abstract from default.
	//public abstract void go();
	
	// Rule 4. Class Wins rule: This method will get higher precedence over same level Interface's
	// default method.
//	public void go() {
//		System.out.println("This method will get higher precedence over same level Interface's default method.");
//	}
}