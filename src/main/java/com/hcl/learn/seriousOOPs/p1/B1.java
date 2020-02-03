package com.hcl.learn.seriousOOPs.p1;

import com.hcl.learn.seriousOOPs.p2.C2;

//"Inheritance"
//Rule 1. Sub class can access super class non private memebers and methods
//Rule 2. Super class cannot access sub class member and methods.
//Rule 3. Sub class can also override super class members/ add new members/Inherit
//Rule 4. Sub/Derived/SuperType class = Super + Sub class capabilities.
//Rule 5. extends keyword is used to implement Inheritance.
//Rule 6. A class can only Inherit one class.
//Rule 7. Static members are also "Inheritable".

//"Inheritance" + "Access Modifiers"
//Private: Not Inherited.
//Default: Inherited from family(same package)
//Protected: Inherited from family(same package) & Other package via Inheritance.
//Public: Anyone can access.

// IS-A Test(Inheritance)
// ChiefEditor is a User
// Surgeon is a Doctor

// HAS-A Test(Composition)
// Bookmark HAS-A Review: so bookmark can have review memeber/method.
// Bathroom HAS-A Tub.

public class B1 {
	public static void main(String[] args) {
		// System.out.println("A1.privateMember: " + A1.privateMember);

		System.out.println("A1.defaultMember: " + A1.defaultMember);
		System.out.println("C1.defaultMember: " + C1.defaultMember);

		System.out.println("A1.protectedMember: " + A1.protectedMember);
		System.out.println("C1.protectedMember: " + C1.protectedMember);
		System.out.println("C2.protectedMember: " + C2.protectedMember);

		System.out.println("A1.publicMember: " + A1.publicMember);
		System.out.println("C1.publicMember: " + C1.publicMember);
	}
}
