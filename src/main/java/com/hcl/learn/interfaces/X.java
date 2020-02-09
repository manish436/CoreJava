package com.hcl.learn.interfaces;

public class X extends AbstractA implements A, B, C, Cloneable {
	public void foo() {
		System.out.println("X: foo");
		System.out.println("VAL: " + B.VAL);
	}

	public void foobar() {
		System.out.println("X: foobar");
	}

	@Override
	protected C clone() {
		try {
			// Providing clone of C type object, thus explicit cast.
			return (C) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	// @Override
	// public void go() {
	// B.super.go();
	// }

	// Rule 2. Static method Not inherited.
	public void inheritanceTest() {
		// staticMethod();
		
		//Rule 4. Static method can be called from default method.
		// But static methods can be called from default method of interface itself.
		go();
	}
}