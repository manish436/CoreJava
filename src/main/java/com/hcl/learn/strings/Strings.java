package com.hcl.learn.strings;


// ********* String class *********************************/
// String is object of class java.lang.String
// String class usages character array to store text.
// Usages UTF-16.
// String contain "immutable" unicode characters.
// When we say immutable that means, String object is immutable but Object reference can be changed many times.

// String can be created in two ways:
// 1. Using String literal
// String literal is stored in in heap area, String is stored in "String Pool". to save memory, but only when created with String keyword
// like: String s = "hi"

// 2. Using new keyword
// With new keyword it will create new object everytime, and will not share to other String s2 = new String("same string");
// like: String s = new String("jello");

// Process of building string pool is called "interning".
// We can all intern() to do explicit interning. or putting string into SCP.

// Some 3rd party String Utils
// Apache common lang ~ StringUtils
// Guava's String utility classes.

// Reason for String immutability:
// 1. If not immutable then while sharing string in SCP will cause serious issues.
// 2. For supporting Concurrency.
// 3. Security

// ***** String builder ****************************************/
// Mutable
// Not synchronized.
// Introduced with java 5, used in place with String buffer.
// Faster then String buffer.

//***** String buffer ****************************************/
// Mutable
// Synchronized.
// before java 5 String builder was used but due to slowness Obsoleted.
// Slower due to concurrency.


// Item - 51 : Beware the performance of string concatenation.
// Use StringBuilder instead of + operator.


// Anything concatenated at run-time MUST go outside string pool.
public class Strings {

	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);

		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());

		// Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));// returns Zero if both
																							// string is same.

		// Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));

		// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));

		// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));

		// Case conversions (Note: String is immutable. So, only a copy is returned)
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());

		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing
														// white spaces

		// Replace (e.g., replace comma's with white-space)
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));

		// Split (e.g., split a document into words or split a line of text by tab or
		// comma or white space)
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}

		// Static method (includes overloaded methods)
		// String mySting = (String) 2.1; not possible, below is the approach.
		System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
	}

	static void stringPool() {
		System.out.println("\nInside stringPool ...");
		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!".intern();
		String s4 = new String("hello!");
		String s5 = "lo!";

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 == s4: " + (s1 == s4));
		System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
		System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
		
		// Anything concatenated at run-time MUST go outside string pool.
		System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));// Not defined at compile time, hence it("hel" + s5) will not be stored interned.
	}

	static void stringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("world");
		String s = sb.append("Good").append("morning").toString();
		System.out.println(s);
	}

	public static void main(String[] args) {
		//stringExamples();
		stringBuilder();
	}

}
