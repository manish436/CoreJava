package com.hcl.learn.VariablesOpertorsArrays;

public class RelationalOrComparison {
	
	
	// Comparison or Relational operators
	static void comparisonOperators() {
		int age = 20;	
		/*
		 * if (age > 21) { System.out.println("Graduate student"); }
		 */
		System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));
		System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
		System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)

		boolean isInternational = true;
		// System.out.println("isInternational <= true: " + (isInternational <= true));
		System.out.println("isInternational == true: " + (isInternational == true));
		System.out.println("isInternational != true: " + (isInternational != true));

		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));

		update(s1, "John");
	}

	static boolean update(Student s, String name) {
		if (s == null) {
			return false;
		}

		s.name = name;
		return true;
	}

	public static void main(String[] args) {
		comparisonOperators();
	}

}
