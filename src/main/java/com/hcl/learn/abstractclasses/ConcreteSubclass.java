package com.hcl.learn.abstractclasses;

import com.hcl.learn.interfaces.MyTestInterface;

//"Abstract Class":
//Non-instantiable but define common protocol for subclass.
//Rule 1. Abstract method can not be static.
//Rule 2. Must be overridden.
//Rule 3. An abstract class can have zero abstract method.
//Rule 4. Can not have abstract method in non abstract class.
//Rule 5. Abstract class can have one or more concrete methods.

//"Abstract subclass"
//Rule 6. No need to override abstract methods if sub class is abstract class.
//Rule 7. Can also define new abstract methods.

//"Concrete Subclass"
//Rule 1. Unimplemented abstract methods must be implemented.

public class ConcreteSubclass extends AbstractSubclass {
	@Override
	void test2() {
		System.out.println("test2");
	}

	@Override
	void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		ConcreteSubclass concrete = new ConcreteSubclass();
		concrete.test1();
		concrete.test2();
		concrete.test3();

		// Can not create instance of abstract class.
		// AbstractSuperclass test = new AbstractSuperclass();
	}
}
