package com.hcl.learn.exceptions;

import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		sum();
	}

	public static void sum() {
		StringBuffer stringBuffer = null;
		try {
			stringBuffer = new StringBuffer();
			stringBuffer.append("Inital");
			throw new IOException();
		} catch (Exception e) {
			stringBuffer.append("Added");
		} finally {
			stringBuffer.append("Even this will be added");
		}
		System.out.println(stringBuffer);
	}

}
