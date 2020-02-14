package com.hcl.learn.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {
	
	// Rule 3.
	public static void send(int destination, String data, String partner) throws FileNotFoundException {
		System.out.println("\nInside send ...");
		if (destination == 0){
			throw new FileNotFoundException();
		}
		
		System.out.println("\nEnd of send ...");
	}
}
