package com.hcl.learn.accessSpecifiers;

// Access Specifiers helps in accessing Classes/Interfaces and members.
// Access Specifiers have to be defined below the return type or class keyword.

// 1.Private: Access within the class only.
// 2.Default: Access only within the package.
// 3.Protected: Access within the package and any subclasses.
// 4.Public: Access in and outside the package(everywhere).

// Class: Can be Public and Default
// Class Members: Can be Public/Default/Protected/Private.

// Item 14: In public class use accessor methods(getter(accessor)/setter(mutator)) not public fields
// Item 13: Minimize the accessibility of classes and members

// Article: https://www.javaworld.com/article/2075271/encapsulation-is-not-information-hiding.html

public class AccessSpecifiers {

	void privateMethodLocalvariable() {
		// Can not have private local variable.
		// private int x;
	}

	class Person {
		//Private to class not private to Object to its class.
		private int id;//this can not be accessed by the BankAccount class.
		private BankAccount account;

		Person(BankAccount account) {
			this.account = account;
		}

		
		public Person someMethod(Person person) {
			// Private to class not private to Object to its class.
			// Why accessing private field is possible?
			BankAccount a = person.account;
			return person;
		}
	}

}
