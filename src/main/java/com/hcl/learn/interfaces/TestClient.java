package com.hcl.learn.interfaces;

import java.util.ArrayList;
import java.util.List;

//"Interface"
//Rule 1. Before java8 All methods should be public and abstract only.
//Rule 2. Can not have variables, No state so no-instantiable.
//Rule 3. Interface can be extended by sub Interface. It can also extend multiple Interfaces. (ex. interface BlockingDeque<E> extends BlockingQueue<E>, Deque<E>).
//Rule 4. Compiler adds adds abstract keyword implicitly with the name of Interface.
//Rule 5. Interface can be public/default.
//Rule 6. Interface can have only constants static final.
//Rule 7. Prior to java 8 Interface was pure abstract class.
//Rule 8. With java8 Interfaces can have Default and Static methods with body.
//Rule 9. All the members of Interface is implicitly public.
//Rule 10. Members of Interface can't be private or protected.
//Rule 11. If we remove public keyword from Interface declaration then Interface will be become default and all its members also become default(not visible outside the package).
//Rule 12. Interface can only be Reference type not Object type, but he methods can only be called which is defined in interface(as it done as compile time)

// Type of interfaces:
// 1. Representative Interface. example List
// 2. Mixin like comparable. mixing additional capability.
// 3. Marker Interfaces: no method, just for JVM. example RandomAccess, Serializable, Cloneable 

// Item-18 - Prefer interface to abstract classes.
// Item 52 - Refer to objects by their interfaces.

// "When to go for interface over abstract class?"
// When we need multiple inheritance.
// Should not be used when having some core identity, then use abstract class.

//"Default Methods"
// 1. After adding default method, implementation class does not need to recompile. 
// 2. Sub class can provide more specific implementation of default method, thus default methods can never be final/static and syncronized.
// 3. Default methods can also be used in functional interface.
//Rule 1. Default methods are instance methods, thus you can not class with Interfacename.MethodName.
//Rule 2. We can not have same name default method in 2 parent classes, that will cause diamond problem.
//Rule 3. We can not have same name default method in parent class and in another parent class one abstract method with same name, that will also cause diamond problem.
//Rule 4. Class Wins rule: One parent class have method name X and another parent interface has default method with same name X then Class method will bet higher precedence over default method.
//Rule 5. Sub interface wins. similar to class hierarchy.
//Rule 6. Solution to the problem(rule 3) is implementing class has to provide implementation code itself,
// Also from class implementation's implementation code method we can can call any interface default method like 
// B.super.go();, remember default method is instance method thus we have to class it with super keyword not with B.go only. 
//Rule 7. default keyword can only be used in Interfaces.
//Rule 8. Can re-abstract default method, if not happy with the implementation of default method in interface.
//Rule 9. Default method can access static methods

//"Static methods in Interface"
//Rule 1. Used as utility methods.
//Rule 2. Not inherited.
//Rule 3. invoked only via interface name.
//Rule 4. Static method can be called from default method.

//"Clonable"
//Rule 1. It is protected in Object class thus meant to be overridden.
//Rule 2. We can not simple call clone method with any object, we have to implements Clonable and provide code for the same.
//Rule 3. Simply by add Clonable, the class will not start cloning, you have to provide implementation in class.
//Rule 4. Compiler does not complains if you just implements Clonable and does not provide code for the same, Exception(CloneNotSupported) will come when you will call the clone method.

public class TestClient {
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		C c = new X();
		c.foo();
		c.bar();
		c.foobar();
		
		//Rule 3. invoked only via interface name.
		//c.staticMethod();
		C.staticMethod();

		// Rule 12. Interface can only be Refrence type not Object type, but he methods
		// can only be called which is defined in interface(as it done as compile time).
		Comparable myclass = new MyTestInterface();
		// myclass.sum();
		
		List list = new ArrayList<String>();
		
	}
}