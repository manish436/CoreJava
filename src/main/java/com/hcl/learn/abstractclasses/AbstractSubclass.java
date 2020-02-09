package com.hcl.learn.abstractclasses;

//Rule 6
abstract class AbstractSubclass extends AbstractSuperclass {

	// No need to override sum method.
	// @Override
	// public void test2() {
	// }

	@Override
	void test1() {
		System.out.println("test1");
	}

	// Rule 7
	// can also define new abstract methods.
	abstract void test3();
}
