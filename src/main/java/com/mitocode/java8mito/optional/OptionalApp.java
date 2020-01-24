package com.mitocode.java8mito.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {

	public void test(String value) {
		//This code throws NullPointerException
		//System.out.println(value.contains("mito"));
		
		//This code throws NoSuchElementException
		try {
			Optional op = Optional.empty();
			op.get();			
		} catch(Exception e) {
			System.err.println("There isn't any element");
		}
	}
	
	public void orElse(String value) {
		Optional<String> op = Optional.ofNullable(value);
		String x = op.orElse("default value");
		System.out.println(x);
	}
	
	public void orElseThrow(String value) {
		Optional<String> op = Optional.ofNullable(value);
		op.orElseThrow(NoSuchElementException::new); //Whatever exception
	}
	
	public void isPresent(String value) {
		Optional<String> op = Optional.ofNullable(value);
		System.out.println(op.isPresent());
	}
	
	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		//app.test(null);
		//app.orElse(null);
		//app.orElseThrow(null);
		app.isPresent("some");
	}
	
}
