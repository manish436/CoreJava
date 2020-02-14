package com.hcl.learn.exceptions;

// "Exceptions"
//Rule 1. "Either handle or throws or both rule" If a class throw any exception then the class have to either try catch or define throws.
// The class which will be using the above class again have to either try catch or define throws.
//Rule 2. Catch block can also re-throw the exception.
//Rule 3. If a class throw an exception then we have to define in method definition( with throws).
//Rule 4. If we define in method definition( with throws) but no related code inside method. 

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
	
	public static void main(String[] args) throws FileNotFoundException {	
		System.out.println("\nInside main ...");		
		//try {
			share();
		/*} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	*/				
		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");
		
		//Rule 1
		try {
			HttpConnect.send(0, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			//Rule 2.
			//throw e;
			throw new FileNotFoundException();
		}		
		
		System.out.println("\nEnd of share ...");
	}	
	 
}
