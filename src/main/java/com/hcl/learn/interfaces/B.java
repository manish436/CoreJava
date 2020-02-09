package com.hcl.learn.interfaces;

public interface B {
	int VAL = TestClient.getVal();

	void foo();

	// Rule 2. We can not have same name default method in 2 parent classes, that
	// will cause diamond problem.
	// default void go() {
	// }
}